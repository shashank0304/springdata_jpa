package com.ssangu.springjpa.crudoperations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
		product.setPrice(30900d);
		
		repos.save(product);
		
	}
	
	@Test
	public void testReadProduct() {
		
		Product product = repos.findById("1").get();
		assertNotNull(product);
		assertEquals("Ipad", product.getName());
		
	}
	
	@Test
	public void testUpdateProduct() {
		
		Product product = repos.findById("1").get();
		product.setPrice(30900d);
		repos.save(product);
	}
	
	@Test
	public void testDeleteProduct() {
		
		if(repos.existsById("1")) {
			repos.deleteById("1");
		}
	}
	
	@Test
	public void testExistsProduct() {
		
		assertEquals(true, repos.existsById("1"));
	}
	
	@Test
	public void testCount() {
		
		System.out.println("Total Items:>>>>>>>>>>>>>>>>>>>>>>>>>"+repos.count());
	}

}
