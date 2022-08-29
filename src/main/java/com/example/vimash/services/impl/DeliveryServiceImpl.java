package com.example.vimash.services.impl;

import com.example.vimash.utils.ApiValidateException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = { ApiValidateException.class, Exception.class })
public class DeliveryServiceImpl {
}
