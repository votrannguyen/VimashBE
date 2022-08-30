package com.example.vimash.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.vimash.bean.jpa.jpa.DeliveryEntity;
import com.example.vimash.dao.AbstractBaseDao;
import com.example.vimash.dao.DeliveryDao;

@Repository
public class DeliveryDaoImpl extends AbstractBaseDao implements DeliveryDao {
	
	@Override
	public List<DeliveryEntity> getAllDelivery(Integer customerId, Integer page, Integer size) {
		List<DeliveryEntity> deliverList = null;
		String sql = "select c from DeliveryEntity c" + " where del_flg = 0 " + " and customer_id = :customerId";
		TypedQuery<DeliveryEntity> query = this.getEntityManager().createQuery(sql, DeliveryEntity.class);
		query.setParameter("customerId", customerId);
		Integer firstResult = (page - 1) * size;
		deliverList = query.setFirstResult(firstResult).setMaxResults(size).getResultList();
		return deliverList;
	}
	
}
