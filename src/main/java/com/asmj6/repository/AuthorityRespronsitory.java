package com.asmj6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.asmj6.bean.Accounts;
import com.asmj6.bean.Authorities;

import java.util.List;

public interface AuthorityRespronsitory extends JpaRepository<Authorities, Integer> {
	
    @Query("SELECT DISTINCT a FROM Authorities a WHERE a.account IN ?1")
    List<Authorities> authoritiesOf(List<Accounts> accounts);
}
