package com.example.vimash.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.vimash.bean.jpa.ResultBean;
import com.example.vimash.bean.jpa.jpa.DeliveryEntity;
import com.example.vimash.bean.jpa.jpa.response.DeliveryReponse;
import com.example.vimash.dao.DeliveryDao;
import com.example.vimash.services.DeliveryService;
import com.example.vimash.utils.ApiValidateException;
import com.example.vimash.utils.Constants;

@Service
@Transactional(rollbackFor = { ApiValidateException.class, Exception.class })
public class DeliveryServiceImpl implements DeliveryService {
	@Autowired
	private DeliveryDao deliveryDao;

	@Override
	public ResultBean getDelivery(Integer customerId, Integer page, Integer size)
			throws ApiValidateException, Exception {
		List<DeliveryEntity> deliveryList = null;
		deliveryList = deliveryDao.getAllDelivery(customerId, page, size);
		List<DeliveryReponse> deliveryReponsesList = deliveryList.stream().map(deliveryEntity -> {
			return new DeliveryReponse(deliveryEntity.getDeliveryId(), deliveryEntity.getDestinationName(),
					deliveryEntity.getPicName(), deliveryEntity.getPostCode(), deliveryEntity.getAddress1(),
					deliveryEntity.getPhoneNumber(), deliveryEntity.getFaxNumber(), deliveryEntity.getLeadTime(),
					deliveryEntity.getCourseCode(), deliveryEntity.getRouteCode());
		}).collect(Collectors.toList());

		return new ResultBean(deliveryReponsesList, Constants.STATUS_OK, Constants.MESSAGE_OK);
	}
}
