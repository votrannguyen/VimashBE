package com.example.vimash.services.impl;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.bean.jpa.response.RouteResponse;
import com.example.vimash.dao.RouteDao;
import com.example.vimash.services.RouteService;
import com.example.vimash.utils.ApiValidateException;
import com.example.vimash.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = { ApiValidateException.class, Exception.class })
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteDao routeDao;


    @Override
    public ResultBean getRoute() throws ApiValidateException, Exception {
        List<RouteResponse> customerEntityList = null;
        customerEntityList = routeDao.getAllRoute();
        return new ResultBean(customerEntityList, Constants.STATUS_OK, Constants.MESSAGE_OK);
    }
}
