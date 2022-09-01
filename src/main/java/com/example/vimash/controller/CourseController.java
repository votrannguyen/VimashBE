package com.example.vimash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.services.CourseService;
import com.example.vimash.utils.ApiValidateException;
import com.example.vimash.utils.Constants;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	
/*
 * get CourseCode and courseName by routeCode*/	
	@RequestMapping(value = "/api/getCourseReponseByRouteCode/{routeCode}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResultBean> getCourseResponseEntity(@PathVariable String routeCode){
		ResultBean resultBean = null;
		try {
			resultBean = courseService.getCourseReponseByRouteCode(routeCode);
		} catch (ApiValidateException e) {
            resultBean = new ResultBean(e.getCode(), e.getField(), e.getMessage());
            return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
		}
		catch (Exception e) {
			 resultBean = new ResultBean(Constants.STATUS_SYSTEM_ERROR, Constants.MESSAGE_SYSTEM_ERROR);
	         return new ResponseEntity<ResultBean>(resultBean, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
	}
		
	

}
