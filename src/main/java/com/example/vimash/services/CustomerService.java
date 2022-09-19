package com.example.vimash.services;


import javax.servlet.http.HttpServletResponse;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.utils.ApiValidateException;

public interface CustomerService {

	/*
	 * download csv customer
	 */
	
	
//	public ResultBean getCustomer(String name, String code1, String code2, Integer page, Integer size) throws ApiValidateException,Exception;

	
    public ResultBean getCustomer(String json) throws ApiValidateException,Exception;

    public ResultBean addCustomer(String company) throws ApiValidateException,Exception;

}
