package com.example.vimash.dao;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;

import java.util.List;

public interface CustomerDao {
    List<CustomerEntity> getAllCustomer(String name, String code, Integer size);
}
