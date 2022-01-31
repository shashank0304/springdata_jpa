package com.ssangu.springjpa.crudoperations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ssangu.springjpa.crudoperations.entities.Product;
import com.ssangu.springjpa.crudoperations.repos.ProductRepository;

@SpringBootTest
class CrudOperationsApplicationTests {
	
	@Autowired
	ProductRepository repos;
	
	@Test
	public void createProduct() {
		
		Product product = new Product();
		product.setId("1");
		product.setName("Ipad");
		product.setDesc("Apple IPad");
		product.setPrice(30800d);
		
		//repos.save(product);
		
	}
	
	@Test
	public void readProduct() {
		
		Product product = repos.findById("1").get();
		System.out.println(product.getDesc());
		
	}

}
