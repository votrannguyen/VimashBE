package com.example.vimash.dao;

import com.example.vimash.bean.jpa.jpa.RouteEntity;

import java.util.List;

public interface RouteDao {

    public List<RouteEntity> getAll();
}
