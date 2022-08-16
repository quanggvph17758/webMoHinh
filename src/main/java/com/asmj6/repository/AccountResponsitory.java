package com.asmj6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import com.asmj6.bean.Accounts;

import java.util.List;

public interface AccountResponsitory extends JpaRepository<Accounts, String>{
	
    @Query("SELECT DISTINCT ar.account FROM Authorities ar WHERE ar.role.id IN ('DIRE','STAF')")
    List<Accounts> getAdministrators();
}
