package com.asmj6.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asmj6.bean.Categories;
import com.asmj6.service.CategoryService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/categories")
public class CategoryRestController {
    @Autowired
    CategoryService categoryService;

    @GetMapping()
    public List<Categories> getAll(){
        return categoryService.findAll();
    }
}
