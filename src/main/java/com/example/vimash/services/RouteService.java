package com.example.vimash.services;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.utils.ApiValidateException;

public interface RouteService {
	
	public ResultBean getRouteCode() throws ApiValidateException,Exception;

}
