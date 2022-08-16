package com.asmj6.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.asmj6.bean.Products;

@Service
public interface ProductService {

	<S extends Products> List<S> findAll(Example<S> example, Sort sort);

	<S extends Products> List<S> findAll(Example<S> example);

	Products getReferenceById(Integer id);

	Products getById(Integer id);

	void deleteAll();

	void deleteAll(Iterable<? extends Products> entities);

	Products getOne(Integer id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Integer> ids);

	<S extends Products, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void delete(Products entity);

	void deleteAllByIdInBatch(Iterable<Integer> ids);

	void deleteById(Integer id);

	<S extends Products> boolean exists(Example<S> example);

	long count();

	void deleteAllInBatch(Iterable<Products> entities);

	<S extends Products> long count(Example<S> example);

	void deleteInBatch(Iterable<Products> entities);

	<S extends Products> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends Products> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends Products> S saveAndFlush(S entity);

	boolean existsById(Integer id);

	void flush();

	<S extends Products> List<S> saveAll(Iterable<S> entities);

	Products findById(Integer id);

	List<Products> findAllById(Iterable<Integer> ids);

	List<Products> findAll(Sort sort);

	Page<Products> findAll(Pageable pageable);

	List<Products> findAll();

	<S extends Products> Optional<S> findOne(Example<S> example);

	<S extends Products> S save(S entity);

	List<Products> findByCategoryId(String cid);

    Products create(Products product);

	Products update(Products product);

	void delete(Integer id);
}
