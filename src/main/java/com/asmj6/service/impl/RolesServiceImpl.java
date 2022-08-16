package com.asmj6.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asmj6.bean.Roles;
import com.asmj6.repository.RoleResponsitory;
import com.asmj6.service.RoleService;

import java.util.List;

@Service
public class RolesServiceImpl implements RoleService {
	
    @Autowired
    RoleResponsitory roleResponsitory;

    public List<Roles> findAll(){
        return roleResponsitory.findAll();
    }
}
