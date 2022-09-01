package com.example.vimash.services;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.utils.ApiValidateException;

public interface CourseService {

	
//	get courseCode, courseName by routeCode
	public ResultBean getCourseReponseByRouteCode(String routeCode) throws ApiValidateException, Exception;
	
}
