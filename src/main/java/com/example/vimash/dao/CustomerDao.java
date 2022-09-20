package com.example.vimash.dao;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.request.CustomerSearchListRequest;
import com.example.vimash.bean.jpa.response.CustomerResponse;
import com.example.vimash.bean.jpa.response.customer.CustomerIPageResponse;
import com.example.vimash.utils.ApiValidateException;

import java.util.List;

public interface CustomerDao {
    List<CustomerEntity> getAllCustomer();

    CustomerResponse finByIdCustomer(Integer id);
    public void addCustomer(CustomerEntity customerEntity) throws ApiValidateException,Exception;

    public void updateCustomer(CustomerEntity customerEntity) throws ApiValidateException,Exception;

    public void checkCustomerCode(String customerCode) throws ApiValidateException,Exception;

    public void deleteCustomer(Integer id) throws ApiValidateException,Exception;

    public CustomerIPageResponse findAll(CustomerSearchListRequest search);

}
