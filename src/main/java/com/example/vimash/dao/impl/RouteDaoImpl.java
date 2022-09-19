package com.example.vimash.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.vimash.bean.jpa.jpa.RouteEntity;
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
        sql.append(" SELECT r FROM  RouteEntity r ");
        TypedQuery<RouteEntity> query = this.getEntityManager().createQuery(sql.toString(), RouteEntity.class);
        
        List<RouteEntity> list = query.getResultList();
        List<RouteReponse> routeReponses = new ArrayList<>();
        
        for(int i = 0; i < list.size(); i++) {
        	RouteReponse routeReponse = new RouteReponse(list.get(i).getRouteCode(), list.get(i).getRouteName());
        	routeReponses.add(routeReponse);
        }
		return routeReponses;
	}	
	
	
	
	
}
	