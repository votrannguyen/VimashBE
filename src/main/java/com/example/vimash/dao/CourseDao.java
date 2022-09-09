package com.example.vimash.dao;

import com.example.vimash.bean.jpa.response.CourseResponse;
import com.example.vimash.bean.jpa.response.RouteResponse;
import com.example.vimash.utils.ApiValidateException;

import java.util.List;

public interface CourseDao {
    List<CourseResponse> getAllCourse(String code);
}
