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
	public List<CustomerEntity> getAllCustomer(String name, String code, Integer size) {
		List<CustomerEntity> companyList = null;
		String s = "select c from CustomerEntity c" + " where del_flg = 0 and customer_code LIKE '%" + code
				+ "%' and customer_name LIKE '%" + name + "%'";
		companyList = entityManager.createQuery(s, CustomerEntity.class).setFirstResult(0).setMaxResults(size)
				.getResultList();
		return companyList;
	}

	@Override
	public CustomerIPageResponse findAll(CustomerSearchListRequest search) {
		return super.findAll(search);
	}
}
