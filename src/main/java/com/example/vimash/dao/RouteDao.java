package com.example.vimash.dao;

import com.example.vimash.bean.jpa.jpa.CourseEntity;
import com.example.vimash.bean.jpa.response.CustomerResponse;
import com.example.vimash.bean.jpa.response.RouteResponse;

import java.util.List;

public interface RouteDao {
    List<RouteResponse> getAllRoute();
}
