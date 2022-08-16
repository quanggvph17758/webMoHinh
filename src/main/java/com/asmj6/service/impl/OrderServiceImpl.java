package com.asmj6.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.asmj6.bean.OrderDetail;
import com.asmj6.bean.Orders;
import com.asmj6.repository.OrderDetailResponsitory;
import com.asmj6.repository.OrderResponsitory;
import com.asmj6.service.OrderService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderResponsitory responsitory;
	@Autowired
	private OrderDetailResponsitory responsitory2;
	public OrderServiceImpl(OrderResponsitory responsitory) {
		super();
		this.responsitory = responsitory;
	}

	
	@Override
	public Orders create(JsonNode orderData) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();

		Orders order = mapper.convertValue(orderData, Orders.class);
		responsitory.save(order);

	TypeReference<List<OrderDetail>> type = new TypeReference<List<OrderDetail>>(){};
	List<OrderDetail> details = mapper.convertValue(orderData.get("orderDetails"), type)
			.stream().peek(d->d.setOrder(order)).collect(Collectors.toList());
	responsitory2.saveAll(details);
	return order;
	}


	
	@Override
	public Orders findById(Integer id) {
		return responsitory.findById(id).get();
	}


	@Override
	public List<Orders> findByUsername(String username) {
		// TODO Auto-generated method stub
		return responsitory.findByUsername(username);
	}
	
}
