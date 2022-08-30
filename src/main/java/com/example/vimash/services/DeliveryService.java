package com.example.vimash.services;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.utils.ApiValidateException;

public interface DeliveryService {
	public ResultBean getDelivery(Integer customerId, Integer page, Integer size)
			throws ApiValidateException, Exception;
}
