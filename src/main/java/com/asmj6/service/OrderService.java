package com.asmj6.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asmj6.bean.Orders;
import com.fasterxml.jackson.databind.JsonNode;

@Service
public interface OrderService {
	
	Orders create(JsonNode orderData);

	Orders findById(Integer id);

	List<Orders> findByUsername(String username);

	 
}
