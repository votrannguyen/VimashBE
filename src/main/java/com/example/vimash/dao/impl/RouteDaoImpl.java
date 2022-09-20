package com.example.vimash.dao.impl;

import com.example.vimash.bean.jpa.jpa.RouteEntity;
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
    public List<RouteEntity> getAll() {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT r FROM RouteEntity r WHERE r.delFlg = 0");

        Query query = this.entityManager.createQuery(sql.toString());
        List<RouteEntity> routes = query.getResultList();
        return routes;
    }
}
