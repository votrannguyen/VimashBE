package com.example.vimash.services.impl;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.bean.jpa.response.CourseResponse;
import com.example.vimash.bean.jpa.response.RouteResponse;
import com.example.vimash.dao.CourseDao;
import com.example.vimash.dao.CustomerDao;
import com.example.vimash.services.CourseService;
import com.example.vimash.utils.ApiValidateException;
import com.example.vimash.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = { ApiValidateException.class, Exception.class })
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;



    @Override
    public ResultBean getCourse(String code) throws ApiValidateException, Exception {
        List<CourseResponse> customerEntityList = null;
        customerEntityList = courseDao.getAllCourse(code);
        return new ResultBean(customerEntityList, Constants.STATUS_OK, Constants.MESSAGE_OK);
    }
}
