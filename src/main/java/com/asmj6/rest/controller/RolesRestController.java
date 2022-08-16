package com.asmj6.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asmj6.bean.Roles;
import com.asmj6.service.RoleService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/roles")
public class RolesRestController {
    @Autowired
    RoleService roleService;

    @GetMapping
    public List<Roles> getAll(){
        return roleService.findAll();
    }
}
