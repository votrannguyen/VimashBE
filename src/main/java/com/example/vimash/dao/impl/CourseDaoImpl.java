package com.example.vimash.dao.impl;

import com.example.vimash.bean.jpa.jpa.CourseEntity;
import com.example.vimash.bean.jpa.jpa.RouteEntity;
import com.example.vimash.dao.CourseDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public class CourseDaoImpl implements CourseDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CourseEntity> getAll() {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT c FROM CourseEntity c WHERE c.delFlg = 0");

        Query query = this.entityManager.createQuery(sql.toString());
        List<CourseEntity> course = query.getResultList();
        return course;
    }
}
