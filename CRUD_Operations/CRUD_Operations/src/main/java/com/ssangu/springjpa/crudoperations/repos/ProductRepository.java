package com.ssangu.springjpa.crudoperations.repos;

import org.springframework.data.repository.CrudRepository;

import com.ssangu.springjpa.crudoperations.entities.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
	
	
}
