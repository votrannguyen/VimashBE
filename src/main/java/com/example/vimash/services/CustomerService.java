package com.example.vimash.services;

import javax.servlet.http.HttpServletResponse;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.utils.ApiValidateException;

public interface CustomerService {
	public ResultBean getCustomer(String name, String code, Integer size) throws ApiValidateException, Exception;

	public ResultBean addCustomer(String company) throws ApiValidateException, Exception;

	/*
	 * download csv customer
	 */
	public void createCustomerCSV(HttpServletResponse httpServletResponse, String customerName, String flgAccountLock,
			String flgAuction) throws ApiValidateException, Exception;
	
}
