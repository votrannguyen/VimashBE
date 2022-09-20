package com.example.vimash.dao;

import com.example.vimash.bean.jpa.jpa.CourseEntity;
import com.example.vimash.bean.jpa.jpa.RouteEntity;

import java.util.List;

public interface CourseDao {
    public List<CourseEntity> getAll();
}
