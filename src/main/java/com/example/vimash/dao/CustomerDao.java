package com.example.vimash.dao;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.jpa.response.customer.CustomerIPageResponse;
import com.example.vimash.bean.jpa.request.CustomerSearchListRequest;
import com.example.vimash.utils.ApiValidateException;

import java.util.List;

public interface CustomerDao {
    List<CustomerEntity> getAllCustomer();

    public CustomerIPageResponse findAll(CustomerSearchListRequest search);
    
    public void deleteCustomer(Integer id) throws ApiValidateException,Exception;
}
