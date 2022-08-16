package com.asmj6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asmj6.bean.OrderDetail;

public interface OrderDetailResponsitory extends JpaRepository<OrderDetail, Integer>{

}
