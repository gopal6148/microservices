package com.example.Product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Product.entey.Products;
import com.example.Product.repositery.ProductRepo;
@Service
public class ProductService {
	@Autowired
	private ProductRepo pr;
	
	public Products saveProduct(Products pro) {
		return pr.save(pro);
	}
	public List<Products> saveProducts(List<Products> pro) {
		return pr.saveAll(pro);
	}
	public List<Products> getAllProduct() {
		return pr.findAll();
	} 
	public Products findTheProductById(int id) {
		return pr.findById(id).orElse(null);
	}
	public String deleteproduct(int id) {
		return "remove product succesfully "+id;
	}

}
