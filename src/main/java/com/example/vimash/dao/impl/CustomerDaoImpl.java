package com.example.vimash.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.jpa.response.customer.CustomerIPageResponse;
import com.example.vimash.bean.jpa.request.CustomerSearchListRequest;
import com.example.vimash.dao.AbstractBaseDao;
import com.example.vimash.dao.CustomerDao;

@Repository
public class CustomerDaoImpl extends AbstractBaseDao implements CustomerDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<CustomerEntity> getAllCustomer() {
		List<CustomerEntity> companyList = null;
		StringBuilder sql = new StringBuilder();
		sql.append("select c from CustomerEntity c");
		companyList = entityManager.createQuery(sql.toString(), CustomerEntity.class).setFirstResult(1)
				.setMaxResults(10).getResultList();
		return companyList;
	}

	@Override
	public CustomerIPageResponse findAll(CustomerSearchListRequest search) {
		return super.findAll(search);
	}
}
