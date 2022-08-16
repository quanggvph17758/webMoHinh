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

import com.asmj6.bean.Categories;

@Service
public interface CategoryService  {

	<S extends Categories> List<S> findAll(Example<S> example, Sort sort);

	<S extends Categories> List<S> findAll(Example<S> example);

	Categories getReferenceById(String id);

	Categories getById(String id);

	void deleteAll();

	void deleteAll(Iterable<? extends Categories> entities);

	Categories getOne(String id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends String> ids);

	<S extends Categories, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void delete(Categories entity);

	void deleteAllByIdInBatch(Iterable<String> ids);

	void deleteById(String id);

	<S extends Categories> boolean exists(Example<S> example);

	long count();

	void deleteAllInBatch(Iterable<Categories> entities);

	<S extends Categories> long count(Example<S> example);

	void deleteInBatch(Iterable<Categories> entities);

	<S extends Categories> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends Categories> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends Categories> S saveAndFlush(S entity);

	boolean existsById(String id);

	void flush();

	<S extends Categories> List<S> saveAll(Iterable<S> entities);

	Optional<Categories> findById(String id);

	List<Categories> findAllById(Iterable<String> ids);

	List<Categories> findAll(Sort sort);

	Page<Categories> findAll(Pageable pageable);

	List<Categories> findAll();

	<S extends Categories> Optional<S> findOne(Example<S> example);

	<S extends Categories> S save(S entity);

}
