package com.ssangu.springjpa.finders.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ssangu.springjpa.finders.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	List<Product> findByName(String productName);
	List<Product> findByNameAndDesc(String productName, String productDescription);
	List<Product> findByPriceGreaterThan(Double productPrice);
	List<Product> findByDescContains(String productDesc);
	List<Product> findByPriceBetween(Double productPrice1, Double productPrice2);
	List<Product> findByIdIn(List<Integer> ids);
}	
