package com.example.vimash.dao;

import java.util.List;

import com.example.vimash.bean.jpa.jpa.CourseEntity;
import com.example.vimash.bean.jpa.reponse.CourseReponse;

public interface CourseDao {
	
	

	/*
	 * get courseCode, courseName by routeCode*/
	List<CourseReponse> getCourseReponsesByRouteCode(String routeCode);
}
