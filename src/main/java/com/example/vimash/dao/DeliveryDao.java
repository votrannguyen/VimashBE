package com.example.vimash.dao;

import java.util.List;

import com.example.vimash.bean.jpa.jpa.DeliveryEntity;

public interface DeliveryDao {
	List<DeliveryEntity> getAllDelivery(Integer customerId, Integer page, Integer size);
}
