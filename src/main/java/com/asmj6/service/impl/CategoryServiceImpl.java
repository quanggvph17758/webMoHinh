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

import com.asmj6.bean.Categories;
import com.asmj6.repository.CategoryResponstiory;
import com.asmj6.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryResponstiory responstiory;

	public CategoryServiceImpl(CategoryResponstiory responstiory) {
		super();
		this.responstiory = responstiory;
	}

	@Override
	public <S extends Categories> S save(S entity) {
		return responstiory.save(entity);
	}

	@Override
	public <S extends Categories> Optional<S> findOne(Example<S> example) {
		return responstiory.findOne(example);
	}

	@Override
	public List<Categories> findAll() {
		return responstiory.findAll();
	}

	@Override
	public Page<Categories> findAll(Pageable pageable) {
		return responstiory.findAll(pageable);
	}

	@Override
	public List<Categories> findAll(Sort sort) {
		return responstiory.findAll(sort);
	}

	@Override
	public List<Categories> findAllById(Iterable<String> ids) {
		return responstiory.findAllById(ids);
	}

	@Override
	public Optional<Categories> findById(String id) {
		return responstiory.findById(id);
	}

	@Override
	public <S extends Categories> List<S> saveAll(Iterable<S> entities) {
		return responstiory.saveAll(entities);
	}

	@Override
	public void flush() {
		responstiory.flush();
	}

	@Override
	public boolean existsById(String id) {
		return responstiory.existsById(id);
	}

	@Override
	public <S extends Categories> S saveAndFlush(S entity) {
		return responstiory.saveAndFlush(entity);
	}

	@Override
	public <S extends Categories> List<S> saveAllAndFlush(Iterable<S> entities) {
		return responstiory.saveAllAndFlush(entities);
	}

	@Override
	public <S extends Categories> Page<S> findAll(Example<S> example, Pageable pageable) {
		return responstiory.findAll(example, pageable);
	}

	@Override
	public void deleteInBatch(Iterable<Categories> entities) {
		responstiory.deleteInBatch(entities);
	}

	@Override
	public <S extends Categories> long count(Example<S> example) {
		return responstiory.count(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<Categories> entities) {
		responstiory.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return responstiory.count();
	}

	@Override
	public <S extends Categories> boolean exists(Example<S> example) {
		return responstiory.exists(example);
	}

	@Override
	public void deleteById(String id) {
		responstiory.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		responstiory.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(Categories entity) {
		responstiory.delete(entity);
	}

	@Override
	public <S extends Categories, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return responstiory.findBy(example, queryFunction);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		responstiory.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		responstiory.deleteAllInBatch();
	}

	@Override
	public Categories getOne(String id) {
		return responstiory.getOne(id);
	}

	@Override
	public void deleteAll(Iterable<? extends Categories> entities) {
		responstiory.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		responstiory.deleteAll();
	}

	@Override
	public Categories getById(String id) {
		return responstiory.getById(id);
	}

	@Override
	public Categories getReferenceById(String id) {
		return responstiory.getReferenceById(id);
	}

	@Override
	public <S extends Categories> List<S> findAll(Example<S> example) {
		return responstiory.findAll(example);
	}

	@Override
	public <S extends Categories> List<S> findAll(Example<S> example, Sort sort) {
		return responstiory.findAll(example, sort);
	}

}
