package com.example.vimash.services.impl;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.jpa.response.CustomerResponse;
import com.example.vimash.bean.jpa.jpa.response.customer.CustomerIPageResponse;
import com.example.vimash.bean.jpa.request.CustomerSearchListRequest;
import com.example.vimash.dao.CustomerDao;
import com.example.vimash.services.CustomerService;
import com.example.vimash.utils.ApiValidateException;
import com.example.vimash.utils.Constants;
import com.example.vimash.utils.DataUtil;
import com.example.vimash.utils.ValidateData;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Transactional(rollbackFor = { ApiValidateException.class, Exception.class })
public class CustomerServiceImpl implements CustomerService {
    public static final String FILE_JSON_VALIDATE = "customer.json";
    @Autowired
    private CustomerDao customerDao;

//    @Override
//    public ResultBean getCustomer(String name, String code1, String code2, Integer page, Integer size) throws ApiValidateException, Exception {
//
//        List<CustomerEntity> customerEntityList = null;
//        customerEntityList = customerDao.getAllCustomer(name.trim(),code1.trim(), code2.trim(), page, size);
//        List<CustomerResponse> customerResponsesList = customerEntityList.stream().map(customerEntity -> {
//            return new CustomerResponse(customerEntity.getCustomerId(), customerEntity.getCustomerCode(),
//                    customerEntity.getPostCode(), customerEntity.getCustomerName(), customerEntity.getPicName(),
//                    customerEntity.getAddress1(), customerEntity.getPhoneNumber(), customerEntity.getFaxNumber(),
//                    customerEntity.getLeadTime(), customerEntity.getRouteCode(), customerEntity.getCourseCode());
//        }).collect(Collectors.toList());
//
//        return new ResultBean(customerResponsesList, Constants.STATUS_OK, Constants.MESSAGE_OK);
//    }

    @Override
    public ResultBean getCustomer(String name, String code1, String code2, Integer page, Integer size) throws ApiValidateException, Exception {

        CustomerSearchListRequest searchListRequest = new CustomerSearchListRequest();
        searchListRequest.currentPage(page);
        searchListRequest.noRecordInPage(size);
        searchListRequest.addSearchField("name", name, false); //DataUtil.decodeURL(name)
        CustomerIPageResponse response = customerDao.findAll(searchListRequest);
        return new ResultBean(response, Constants.STATUS_OK, Constants.MESSAGE_OK);
    }

    @Override
    public ResultBean addCustomer(String company) throws ApiValidateException, Exception {
        JsonObject jsonObject = DataUtil.getJsonObject(company);
        ValidateData.validate(FILE_JSON_VALIDATE, jsonObject, false);
        return new ResultBean("200", "success", "success");
    }
}
