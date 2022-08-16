package com.asmj6.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.asmj6.bean.Products;
import com.asmj6.service.ProductService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/products")
public class ProductRestController {
	@Autowired
	ProductService productService;
	
	@GetMapping
	public List<Products> getAll() {
		return productService.findAll();
	}
	
	
	@GetMapping("{id}")
	public Products getOne(@PathVariable("id") Integer id) {
		return productService.findById(id);
	}

	@PostMapping
	public Products create(@RequestBody Products product) {
		return productService.create(product);
	}

	@PutMapping("{id}")
	public Products update(@PathVariable("id") Integer id, @RequestBody Products product) {
		return productService.update(product);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		 productService.delete(id);
	}
}
