package com.example.vimash.services;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.utils.ApiValidateException;

public interface CustomerService {
    public ResultBean getCustomer() throws ApiValidateException,Exception;

    public ResultBean findByIdCustomer(Integer id) throws ApiValidateException,Exception;
    public ResultBean findByCustomerCode(String code) throws ApiValidateException,Exception;

    public ResultBean addCustomer(String customer) throws ApiValidateException,Exception;
    public ResultBean updateCustomer(String customer) throws ApiValidateException,Exception;
    public ResultBean deleteCustomer(Integer id) throws ApiValidateException,Exception;
}
