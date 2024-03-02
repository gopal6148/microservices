package com.example.Product.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Product.entey.Products;
@Repository
public interface ProductRepo extends JpaRepository<Products, Integer>{

}
