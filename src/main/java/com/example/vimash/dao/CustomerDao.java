package com.example.vimash.dao;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.jpa.response.customer.CustomerIPageResponse;
import com.example.vimash.bean.jpa.request.CustomerSearchListRequest;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    List<CustomerEntity> getAllCustomer();

    public CustomerIPageResponse findAll(CustomerSearchListRequest search);

    public String deleteSingleCustomer( Long id);

    public Optional<CustomerEntity> findCustomerById(Long id);
}
