package com.example.vimash.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.vimash.bean.jpa.jpa.RouteEntiry;
import com.example.vimash.bean.jpa.reponse.RouteReponse;
import com.example.vimash.dao.AbtractBaseDao;
import com.example.vimash.dao.RouteDao;

@Repository
public class RouteDaoImpl extends AbtractBaseDao implements RouteDao  {
	
/*
 * get routCode and routeName*/
	
	@Override
	public List<RouteReponse> getRouteCodeName() {
		StringBuilder sql = new StringBuilder();
        sql.append(" Select r FROM  RouteEntiry r ");
        TypedQuery<RouteEntiry> query = this.getEntityManager().createQuery(sql.toString(), RouteEntiry.class);
        
        List<RouteEntiry> list = query.getResultList();
        List<RouteReponse> routeReponses = new ArrayList<>();
        
        for(int i = 0; i < list.size(); i++) {
        	RouteReponse routeReponse = new RouteReponse(list.get(i).getRouteCode(), list.get(i).getRouteName());
        	routeReponses.add(routeReponse);
        }
		return routeReponses;
	}	
	
	
	
	
}
	