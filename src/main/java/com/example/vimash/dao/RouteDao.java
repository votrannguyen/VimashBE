package com.example.vimash.dao;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.vimash.bean.jpa.jpa.RouteEntiry;
import com.example.vimash.bean.jpa.reponse.RouteReponse;

public interface RouteDao {
	
//	get routeCode and routeName
	public List<RouteReponse> getRouteCodeName();
	
	

}
