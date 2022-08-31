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
import com.example.vimash.utils.DataUtil;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@Service
@Transactional(rollbackFor = { ApiValidateException.class, Exception.class })
public class DeliveryServiceImpl implements DeliveryService {
	@Autowired
	private DeliveryDao deliveryDao;

	@Override
	public ResultBean getDelivery(String jsonString) throws ApiValidateException, Exception {
		JsonObject jsonObject = new Gson().fromJson(jsonString, JsonObject.class);
		Integer customerId = DataUtil.getJsonInteger(jsonObject, "customerId");
		Integer page = DataUtil.getJsonInteger(jsonObject, "page");
		Integer size = DataUtil.getJsonInteger(jsonObject, "size");
		List<DeliveryEntity> deliveryList = null;
		if (customerId == null) {
			return new ResultBean(Constants.STATUS_NOT_FOUND, Constants.STATUS_SYSTEM_ERROR);
		}
		if (page == null) {
			page = 1;
		}
		if (size == null) {
			size = 10;
		}
		deliveryList = deliveryDao.getAllDelivery(customerId, page, size);
		if (deliveryList.size() == 0) {
			return new ResultBean(Constants.STATUS_NOT_FOUND, Constants.MESSAGE_SYSTEM_ERROR);
		}
		List<DeliveryReponse> deliveryReponsesList = deliveryList.stream().map(deliveryEntity -> {
			return new DeliveryReponse(deliveryEntity.getDeliveryId(), deliveryEntity.getDestinationName(),
					deliveryEntity.getPicName(), deliveryEntity.getPostCode(), deliveryEntity.getAddress1(),
					deliveryEntity.getPhoneNumber(), deliveryEntity.getFaxNumber(), deliveryEntity.getLeadTime(),
					deliveryEntity.getCourseCode(), deliveryEntity.getRouteCode());
		}).collect(Collectors.toList());

		return new ResultBean(deliveryReponsesList, Constants.STATUS_OK, Constants.MESSAGE_OK);
	}
}
