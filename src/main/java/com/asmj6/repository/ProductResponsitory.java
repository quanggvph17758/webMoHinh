package com.asmj6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.asmj6.bean.Products;


public interface ProductResponsitory extends JpaRepository<Products, Integer>{
	
	@Query("select p from Products p where p.category.id=?1")
	List<Products> findByCategoryId(String cid);
}
