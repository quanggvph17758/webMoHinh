package com.asmj6.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asmj6.bean.Accounts;
import com.asmj6.repository.AccountResponsitory;
import com.asmj6.service.AccountService;

import java.util.List;

@Service
	public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountResponsitory responsitory;

	public AccountServiceImpl(AccountResponsitory responsitory) {
		super();
		this.responsitory = responsitory;
	}

	@Override
	public Accounts findById(String username) {
		return responsitory.findById(username).get();
	}

	public List<Accounts> findAll() {
		return responsitory.findAll();
	}

	public List<Accounts> getAdministrators() {
		return responsitory.getAdministrators();
	}
}
