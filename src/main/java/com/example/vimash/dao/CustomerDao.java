package com.example.vimash.dao;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.response.CustomerResponse;

import java.util.List;

public interface CustomerDao {
    List<CustomerResponse> getAllCustomer();

    CustomerResponse finByIdCustomer(Integer id);
    public CustomerEntity addCustomer(CustomerEntity customerEntity);
}
