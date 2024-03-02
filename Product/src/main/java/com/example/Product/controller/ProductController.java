package com.example.Product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product.entey.Products;
import com.example.Product.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService ps;
	@PostMapping("savenewProduct")
	public Products saveProduct(@RequestBody Products pro) {
		return ps.saveProduct(pro);
	}
	@PostMapping("savenewProducts")
	public List<Products> saveProducts(@RequestBody List<Products> pro) {
		return ps.saveProducts(pro);
	}
	@GetMapping("/getProduct")
	public List<Products> getAllProduct() {
		return ps.getAllProduct();
	}
	@GetMapping("productId/{id}")
	public Products findTheProductById(@PathVariable int id) {
		return ps.findTheProductById(id);
	}

}
