package com.asmj6.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.asmj6.bean.Products;
import com.asmj6.repository.ProductResponsitory;
import com.asmj6.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductResponsitory responsitory;

	public ProductServiceImpl(ProductResponsitory responsitory) {
		super();
		this.responsitory = responsitory;
	}

	@Override
	public <S extends Products> S save(S entity) {
		return responsitory.save(entity);
	}

	@Override
	public <S extends Products> Optional<S> findOne(Example<S> example) {
		return responsitory.findOne(example);
	}

	@Override
	public List<Products> findAll() {
		return responsitory.findAll();
	}

	@Override
	public Page<Products> findAll(Pageable pageable) {
		return responsitory.findAll(pageable);
	}

	@Override
	public List<Products> findAll(Sort sort) {
		return responsitory.findAll(sort);
	}

	@Override
	public List<Products> findAllById(Iterable<Integer> ids) {
		return responsitory.findAllById(ids);
	}

	@Override
	public Products findById(Integer id) {
		return responsitory.findById(id).get();
	}

	@Override
	public <S extends Products> List<S> saveAll(Iterable<S> entities) {
		return responsitory.saveAll(entities);
	}

	@Override
	public void flush() {
		responsitory.flush();
	}

	@Override
	public boolean existsById(Integer id) {
		return responsitory.existsById(id);
	}

	@Override
	public <S extends Products> S saveAndFlush(S entity) {
		return responsitory.saveAndFlush(entity);
	}

	@Override
	public <S extends Products> List<S> saveAllAndFlush(Iterable<S> entities) {
		return responsitory.saveAllAndFlush(entities);
	}

	@Override
	public <S extends Products> Page<S> findAll(Example<S> example, Pageable pageable) {
		return responsitory.findAll(example, pageable);
	}

	@Override
	public void deleteInBatch(Iterable<Products> entities) {
		responsitory.deleteInBatch(entities);
	}

	@Override
	public <S extends Products> long count(Example<S> example) {
		return responsitory.count(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<Products> entities) {
		responsitory.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return responsitory.count();
	}

	@Override
	public <S extends Products> boolean exists(Example<S> example) {
		return responsitory.exists(example);
	}

	@Override
	public void deleteById(Integer id) {
		responsitory.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		responsitory.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(Products entity) {
		responsitory.delete(entity);
	}

	@Override
	public <S extends Products, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return responsitory.findBy(example, queryFunction);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		responsitory.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		responsitory.deleteAllInBatch();
	}

	@Override
	public Products getOne(Integer id) {
		return responsitory.getOne(id);
	}

	@Override
	public void deleteAll(Iterable<? extends Products> entities) {
		responsitory.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		responsitory.deleteAll();
	}

	@Override
	public Products getById(Integer id) {
		return responsitory.getById(id);
	}

	@Override
	public Products getReferenceById(Integer id) {
		return responsitory.getReferenceById(id);
	}

	@Override
	public <S extends Products> List<S> findAll(Example<S> example) {
		return responsitory.findAll(example);
	}

	@Override
	public <S extends Products> List<S> findAll(Example<S> example, Sort sort) {
		return responsitory.findAll(example, sort);
	}

	@Override
	public List<Products> findByCategoryId(String cid) {
		// TODO Auto-generated method stub
		return responsitory.findByCategoryId(cid);
	}

	@Override
	public Products create(Products product) {
		return responsitory.save(product);
	}

	@Override
	public Products update(Products product) {
		return responsitory.save(product);
	}

	@Override
	public void delete(Integer id) {
		 responsitory.deleteById(id);
	}

}
