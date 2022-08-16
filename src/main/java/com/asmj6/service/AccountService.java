package com.asmj6.service;

import org.springframework.stereotype.Service;

import com.asmj6.bean.Accounts;

import java.util.List;

@Service
public interface AccountService {

	Accounts findById(String username);
	public List<Accounts> findAll();
	public List<Accounts> getAdministrators();
	
}
