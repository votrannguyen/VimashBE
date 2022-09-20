package com.example.vimash.services.impl;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.bean.jpa.jpa.CourseEntity;
import com.example.vimash.dao.CourseDao;
import com.example.vimash.services.CourseService;
import com.example.vimash.utils.ApiValidateException;
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
    public ResultBean getAll() throws ApiValidateException, Exception {
        List<CourseEntity> courses = courseDao.getAll();
        return new ResultBean(courses, "200", "success");
    }
}
