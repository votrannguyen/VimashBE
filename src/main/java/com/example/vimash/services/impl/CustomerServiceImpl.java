package com.example.vimash.services.impl;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.bean.jpa.jpa.CustomerEntity;
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

import java.util.List;

@Service
@Transactional(rollbackFor = { ApiValidateException.class, Exception.class })
public class CustomerServiceImpl implements CustomerService {
    public static final String FILE_JSON_VALIDATE = "customer.json";
    @Autowired
    private CustomerDao customerDao;

    @Override
    public ResultBean getCustomer(String name, String code, Integer size) throws ApiValidateException, Exception {

        List<CustomerEntity> customerEntityList = null;
        customerEntityList = customerDao.getAllCustomer(name.trim(),code.trim(),size);

        return new ResultBean(customerEntityList, Constants.STATUS_OK, Constants.MESSAGE_OK);
    }

    @Override
    public ResultBean addCustomer(String company) throws ApiValidateException, Exception {
        JsonObject jsonObject = DataUtil.getJsonObject(company);
        ValidateData.validate(FILE_JSON_VALIDATE, jsonObject, false);
        return null;
    }
}
