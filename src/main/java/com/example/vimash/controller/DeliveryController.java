package com.example.vimash.controller;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.services.DeliveryService;
import com.example.vimash.utils.ApiValidateException;
import com.example.vimash.utils.Constants;

@RestController
public class DeliveryController {
	
	@Resource
	private DeliveryService deliveryService;

	@RequestMapping(value = "/api/delivery", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResultBean> getCustomer(
			@RequestParam Integer customer_id
			,@RequestParam(defaultValue = "10") Integer size
			,@RequestParam(defaultValue = "1") Integer page) {
		ResultBean resultBean = null;
		try {
			resultBean = deliveryService.getDelivery(customer_id, page, size);
		} catch (ApiValidateException e) {
			resultBean = new ResultBean(e.getCode(), e.getField(), e.getMessage());
			return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
		} catch (Exception ex) {

			resultBean = new ResultBean(Constants.STATUS_SYSTEM_ERROR, Constants.MESSAGE_SYSTEM_ERROR);
			return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
	}
}
