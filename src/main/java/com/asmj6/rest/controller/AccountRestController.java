package com.asmj6.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.asmj6.bean.Accounts;
import com.asmj6.service.AccountService;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/accounts")
public class AccountRestController {
    @Autowired
    AccountService accountService;

    @GetMapping
    public List<Accounts> getAccounts(@RequestParam("admin") Optional<Boolean> admin) {
        if(admin.orElse(false)) {
            return accountService.getAdministrators();
        }
        return accountService.findAll();
    }
}
