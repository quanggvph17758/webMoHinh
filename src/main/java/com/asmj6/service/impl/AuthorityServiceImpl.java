package com.asmj6.service.impl;

import com.asmj6.bean.Accounts;
import com.asmj6.bean.Authorities;
import com.asmj6.repository.AccountResponsitory;
import com.asmj6.repository.AuthorityRespronsitory;
import com.asmj6.service.AuthorityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    AuthorityRespronsitory authorityRespronsitory;

    @Autowired
    AccountResponsitory accountResponsitory;

    public List<Authorities> findAll() {
        return authorityRespronsitory.findAll();
    }

    public Authorities create(Authorities auth) {
        return authorityRespronsitory.save(auth);
    }

    public void delete(Integer id) {
        authorityRespronsitory.deleteById(id);
    }

    public List<Authorities> findAuthoritiesOfAdministrators() {
        List<Accounts> accounts = accountResponsitory.getAdministrators();
        return authorityRespronsitory.authoritiesOf(accounts);
    }

    @Override
    public Authorities save(Authorities auth) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {
        authorityRespronsitory.deleteById(id);
    }

    @Override
    public List<Authorities> authoritiesOf(List<Accounts> accounts) {
        return null;
    }
}
