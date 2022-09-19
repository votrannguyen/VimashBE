package com.example.vimash.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.bean.jpa.reponse.RouteReponse;
import com.example.vimash.dao.RouteDao;
import com.example.vimash.services.RouteService;
import com.example.vimash.utils.ApiValidateException;

@Service
@Transactional(rollbackFor = { ApiValidateException.class, Exception.class })
public class RouteServiceImpl implements RouteService {

	@Autowired
	RouteDao routeDao;

	@Override
	public ResultBean getRouteCode() throws ApiValidateException, Exception {

		List<RouteReponse> routeReponses = routeDao.getRouteCodeName();

		return new ResultBean(routeReponses, "200", "OK");
	}

}
