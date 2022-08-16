package com.asmj6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.asmj6.bean.Orders;


public interface OrderResponsitory extends JpaRepository<Orders, Integer> {
	
	@Query("select o from Orders o where o.account.username=?1")
	List<Orders> findByUsername(String username);
}
