package com.example.vimash.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vimash.bean.jpa.ResultBean;

@RestController
public class CustomerController {
	
	
	@GetMapping("/customer")
	public ResponseEntity<ResultBean> getCustomer(){
		int a =1;
		int b =2;
		return null;
	}
}
