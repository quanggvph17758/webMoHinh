package com.asmj6.service;

import java.util.List;

import com.asmj6.bean.Accounts;
import com.asmj6.bean.Authorities;

public interface AuthorityService {
	public List<Authorities> findAll();

    public Authorities create(Authorities auth);

    public void delete(Integer id);

    public List<Authorities> findAuthoritiesOfAdministrators();

    Authorities save(Authorities auth);

    void deleteById(Integer id);

    List<Authorities> authoritiesOf(List<Accounts> accounts);
}
