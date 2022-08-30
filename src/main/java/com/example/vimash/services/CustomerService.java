package com.example.vimash.services;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.utils.ApiValidateException;

public interface CustomerService {
    public ResultBean getCustomer() throws ApiValidateException,Exception;

    public ResultBean findByIdCustomer(Integer id) throws ApiValidateException,Exception;

    public ResultBean addCustomer(String company) throws ApiValidateException,Exception;
}
