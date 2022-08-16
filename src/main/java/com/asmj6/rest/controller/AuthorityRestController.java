package com.asmj6.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.asmj6.bean.Authorities;
import com.asmj6.service.AuthorityService;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/rest/authorities")
public class AuthorityRestController {
	
    @Autowired
    AuthorityService authorityService;

    @GetMapping
    public List<Authorities> findAll(@RequestParam("admin") Optional<Boolean> admin) {
        if(admin.orElse(false)) {
            return authorityService.findAuthoritiesOfAdministrators();
        }
        return authorityService.findAll();
    }

    @PostMapping
    public Authorities post(@RequestBody Authorities auth) {
        return authorityService.create(auth);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id) {
        authorityService.delete(id);
    }
}
