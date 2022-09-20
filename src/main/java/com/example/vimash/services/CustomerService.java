package com.example.vimash.services;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.utils.ApiValidateException;

public interface CustomerService {
    public ResultBean getCustomer(Integer page, Integer size, String name, String code1, String code2) throws ApiValidateException,Exception;

    public ResultBean addCustomer(String company) throws ApiValidateException,Exception;

    public ResultBean deleteSingleCustomer(Long id) throws ApiValidateException,Exception;

    public ResultBean findSingleCustomer(Long id) throws ApiValidateException,Exception;
}
