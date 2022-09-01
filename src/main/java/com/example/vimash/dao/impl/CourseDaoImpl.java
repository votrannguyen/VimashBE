package com.example.vimash.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.vimash.bean.jpa.jpa.CourseEntity;
import com.example.vimash.bean.jpa.reponse.CourseReponse;
import com.example.vimash.dao.AbtractBaseDao;
import com.example.vimash.dao.CourseDao;
@Repository
public class CourseDaoImpl extends AbtractBaseDao implements CourseDao {


	@Override
	public List<CourseReponse> getCourseReponsesByRouteCode(String routeCode) {
		StringBuilder sql = new StringBuilder();
		sql.append("Select c from CourseEntity c");
		sql.append(  " where ");
		sql.append("  c.routeCode = :route_code");
		TypedQuery<CourseEntity> query = this.getEntityManager().createQuery(sql.toString(), CourseEntity.class);
		query.setParameter("route_code", routeCode);
		
		List<CourseEntity> courseEntities = query.getResultList();
		List<CourseReponse> courseReponses = new ArrayList<>();
		
		for(int i=0; i< courseEntities.size(); i++) {
			CourseReponse courseReponse = new CourseReponse(courseEntities.get(i).getCourseCode(), courseEntities.get(i).getCourseName());
			courseReponses.add(courseReponse);
		}
		return courseReponses ;
	}

}
