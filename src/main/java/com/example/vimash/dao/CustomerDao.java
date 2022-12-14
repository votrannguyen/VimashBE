package com.example.vimash.dao;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.jpa.response.customer.CustomerIPageResponse;
import com.example.vimash.bean.jpa.request.CustomerSearchListRequest;

import java.util.List;

public interface CustomerDao {
    List<CustomerEntity> getAllCustomer(String name, String code1, String code2, Integer page, Integer size);

    public CustomerIPageResponse findAll(CustomerSearchListRequest search);
}
