package com.example.vimash.dao.impl;

import com.example.vimash.bean.jpa.response.CustomerResponse;
import com.example.vimash.bean.jpa.response.RouteResponse;
import com.example.vimash.dao.RouteDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class RouteDaoImpl implements RouteDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<RouteResponse> getAllRoute() {
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT new  com.example.vimash.bean.jpa.response.RouteResponse( ");
        sql.append("     routeCode, routeName ");
        sql.append(" )");
        sql.append(" FROM RouteEntity ");
        sql.append(" WHERE ");
        sql.append("    delFlg = 0");
        Query query = entityManager.createQuery(sql.toString());
        List<RouteResponse> result = null;
        result = query.getResultList();
        return result;
    }
}
