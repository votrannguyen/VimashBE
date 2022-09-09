package com.example.vimash.dao.impl;

import com.example.vimash.bean.jpa.jpa.CourseEntity;
import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.response.CourseResponse;
import com.example.vimash.bean.jpa.response.RouteResponse;
import com.example.vimash.dao.CourseDao;
import com.example.vimash.utils.ApiValidateException;
import com.example.vimash.utils.Constants;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CourseDaoImpl implements CourseDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CourseResponse> getAllCourse(String code) {
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT new  com.example.vimash.bean.jpa.response.CourseResponse( ");
        sql.append("     courseCode, courseName ");
        sql.append(" )");
        sql.append(" FROM CourseEntity ");
        sql.append(" WHERE ");
        sql.append("    delFlg = 0");
        sql.append("    AND ");
        sql.append("    route_code = '"+code+"'");
        Query query = entityManager.createQuery(sql.toString());
        List<CourseResponse> result = null;
        result = query.getResultList();
        return result;
    }
}
