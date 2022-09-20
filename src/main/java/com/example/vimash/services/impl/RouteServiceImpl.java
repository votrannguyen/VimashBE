package com.example.vimash.services.impl;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.bean.jpa.jpa.RouteEntity;
import com.example.vimash.dao.CustomerDao;
import com.example.vimash.dao.RouteDao;
import com.example.vimash.services.RouteService;
import com.example.vimash.utils.ApiValidateException;
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
    public ResultBean getAll() {
        List<RouteEntity> routes = routeDao.getAll();
        return new ResultBean(routes, "200", "success");
    }
}
