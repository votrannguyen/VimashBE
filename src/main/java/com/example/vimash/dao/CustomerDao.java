package com.example.vimash.dao;

import java.util.List;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.jpa.response.customer.CustomerIPageResponse;
import com.example.vimash.bean.jpa.request.CustomerSearchListRequest;

public interface CustomerDao {

    List<CustomerEntity> getAllCustomer(String name, String code, Integer size);


    public CustomerIPageResponse findAll(CustomerSearchListRequest search);

}
