package com.example.vimash.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.bean.jpa.jpa.CourseEntity;
import com.example.vimash.bean.jpa.reponse.CourseReponse;
import com.example.vimash.dao.CourseDao;
import com.example.vimash.services.CourseService;
import com.example.vimash.utils.ApiValidateException;

@Service
@Transactional(rollbackFor = { ApiValidateException.class, Exception.class })
public class CourseServiceImpl implements CourseService {
	
	@Autowired 
	CourseDao courseDao;

	

	@Override
	public ResultBean getCourseReponseByRouteCode(String routeCode) throws ApiValidateException, Exception {
		List<CourseReponse> courseReponses = courseDao.getCourseReponsesByRouteCode(routeCode);
		return new ResultBean(courseReponses, "200", "OK");
	}
	

}
