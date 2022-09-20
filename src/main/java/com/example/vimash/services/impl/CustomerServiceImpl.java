package com.example.vimash.services.impl;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.response.CustomerResponse;
import com.example.vimash.dao.CustomerDao;
import com.example.vimash.services.CustomerService;
import com.example.vimash.utils.*;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Service
    @Transactional(rollbackFor = { ApiValidateException.class, Exception.class })
public class CustomerServiceImpl implements CustomerService {
    public static final String FILE_JSON_VALIDATE = "customer.json";
    @Autowired
    private CustomerDao customerDao;

        @Override
        public ResultBean getCustomer() throws ApiValidateException, Exception {
            List<CustomerEntity> customerResponse = customerDao.getAllCustomer();
            return new ResultBean(customerResponse, Constants.STATUS_OK, Constants.MESSAGE_OK);
        }

        @Override
    public ResultBean findByIdCustomer(Integer id) throws ApiValidateException, Exception {
        CustomerResponse customerResponse = customerDao.finByIdCustomer(id);
        return new ResultBean(customerResponse, Constants.STATUS_OK, Constants.MESSAGE_OK);
    }

    @Override
    public ResultBean findByCustomerCode(String code) throws ApiValidateException, Exception {
        customerDao.checkCustomerCode(code);
        return new ResultBean(code, Constants.STATUS_OK, Constants.MESSAGE_OK);
    }

    @Override
    public ResultBean addCustomer(String customer) throws ApiValidateException, Exception {
        CustomerEntity customerEntity = new CustomerEntity();

        JsonObject jsonObject = DataUtil.getJsonObject(customer);
        ValidateData.validate(FILE_JSON_VALIDATE, jsonObject, false);

        customerEntity = getCustomerEntity(jsonObject,customerEntity);

        customerDao.checkCustomerCode(customerEntity.getCustomerCode());

        customerDao.addCustomer(customerEntity);

        return new ResultBean(customerEntity, Constants.STATUS_OK, Constants.MESSAGE_OK);
    }

    @Override
    public ResultBean updateCustomer(String customer) throws ApiValidateException, Exception {
        CustomerEntity customerEntity = new CustomerEntity();

        JsonObject jsonObject = DataUtil.getJsonObject(customer);
        ValidateData.validate(FILE_JSON_VALIDATE, jsonObject, false);

        customerEntity = getCustomerEntity(jsonObject,customerEntity);


        try{
            CustomerResponse customerResponse = customerDao.finByIdCustomer(Math.toIntExact(customerEntity.getCustomerId()));
            customerEntity.setCreateDate(customerResponse.getCreateDate());
        }catch (Exception e){
            return new ResultBean("Customer khong ton tai", Constants.STATUS_SYSTEM_ERROR, Constants.MESSAGE_OK);
        }

        customerDao.updateCustomer(customerEntity);

        return new ResultBean(customerEntity, Constants.STATUS_OK, Constants.MESSAGE_OK);
    }

    @Override
    public ResultBean deleteCustomer(Integer id) throws ApiValidateException, Exception {
        customerDao.deleteCustomer(id);
        return new ResultBean(id, Constants.STATUS_OK, Constants.MESSAGE_OK);
    }

    private CustomerEntity getCustomerEntity(JsonObject jsonCustomer, CustomerEntity customerEntity) throws ApiValidateException{
        if(DataUtil.hasMember(jsonCustomer, ConstantColumns.CUSTOMER_NAME)){
            customerEntity.setCustomerName(DataUtil.getJsonString(jsonCustomer,ConstantColumns.CUSTOMER_NAME));
        }
        if(DataUtil.hasMember(jsonCustomer, ConstantColumns.CUSTOMER_ID)){
            customerEntity.setCustomerId(Long.valueOf(DataUtil.getJsonString(jsonCustomer, ConstantColumns.CUSTOMER_ID)));
        }
        if(DataUtil.hasMember(jsonCustomer, ConstantColumns.CUSTOMER_CODE)){
            customerEntity.setCustomerCode(DataUtil.getJsonString(jsonCustomer,ConstantColumns.CUSTOMER_CODE));
        }
        if(DataUtil.hasMember(jsonCustomer, ConstantColumns.FAX_NUMBER)){
            customerEntity.setFaxNumber(DataUtil.getJsonString(jsonCustomer,ConstantColumns.FAX_NUMBER));
        }
        if(DataUtil.hasMember(jsonCustomer, ConstantColumns.POST_CODE)){
            customerEntity.setPostCode(DataUtil.getJsonString(jsonCustomer,ConstantColumns.POST_CODE));
        }
        if(DataUtil.hasMember(jsonCustomer, ConstantColumns.CREATE_BY)){
            if(!(DataUtil.getJsonString(jsonCustomer,ConstantColumns.CREATE_BY) == null)){
                customerEntity.setCreateBy(Integer.parseInt(DataUtil.getJsonString(jsonCustomer,ConstantColumns.CREATE_BY)));
            }

        }
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        customerEntity.setCreateDate(now);

        if(DataUtil.hasMember(jsonCustomer, ConstantColumns.UPDATE_BY)){
            if(!(DataUtil.getJsonString(jsonCustomer,ConstantColumns.UPDATE_BY) == null)){
                customerEntity.setUpdateBy(Integer.parseInt(DataUtil.getJsonString(jsonCustomer,ConstantColumns.UPDATE_BY)));
            }

        }

        customerEntity.setUpdateDate(now);
        if(DataUtil.hasMember(jsonCustomer, ConstantColumns.ROUTE_CODE)){
            customerEntity.setRouteCode(DataUtil.getJsonString(jsonCustomer,ConstantColumns.ROUTE_CODE));
        }
        if(DataUtil.hasMember(jsonCustomer, ConstantColumns.COURSE_CODE)){
            customerEntity.setCourseCode(DataUtil.getJsonString(jsonCustomer,ConstantColumns.COURSE_CODE));
        }
        if(DataUtil.hasMember(jsonCustomer, ConstantColumns.PHONE_NUMBER)){
            customerEntity.setPhoneNumber(DataUtil.getJsonString(jsonCustomer,ConstantColumns.PHONE_NUMBER));
        }
        if(DataUtil.hasMember(jsonCustomer, ConstantColumns.ADDRESS1)){
            customerEntity.setAddress1(DataUtil.getJsonString(jsonCustomer,ConstantColumns.ADDRESS1));
        }
        if(DataUtil.hasMember(jsonCustomer, ConstantColumns.ADDRESS2)){
            customerEntity.setAddress2(DataUtil.getJsonString(jsonCustomer,ConstantColumns.ADDRESS2));
        }
        if(DataUtil.hasMember(jsonCustomer, ConstantColumns.ADDRESS3)){
            customerEntity.setAddress3(DataUtil.getJsonString(jsonCustomer,ConstantColumns.ADDRESS3));
        }
        if(DataUtil.hasMember(jsonCustomer, ConstantColumns.ADDRESS4)){
            customerEntity.setAddress4(DataUtil.getJsonString(jsonCustomer,ConstantColumns.ADDRESS4));
        }
        if(DataUtil.hasMember(jsonCustomer, ConstantColumns.NOTES)){
            customerEntity.setNotes(DataUtil.getJsonString(jsonCustomer,ConstantColumns.NOTES));
        }
        customerEntity.setDelFlg("0");

        return customerEntity;
    }
}
