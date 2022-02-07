package com.ssangu.springjpa.pagingSorting;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

import com.ssangu.springjpa.pagingSorting.entities.Product;
import com.ssangu.springjpa.pagingSorting.repos.ProductRepository;

@SpringBootTest
class SpringDataPagingSortingApplicationTests {
	
	@Autowired
	ProductRepository repos;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testFindAll() {
		
		Pageable pageable = PageRequest.of(0, 5, Sort.by(Direction.DESC, "productPrice"));
		//repos.findByProductDescriptionContains(pageable,"Apple").forEach(p -> System.out.println(p.getProductName()+" "+p.getProductPrice()));
		Page<Product> results = repos.findAll(pageable);
		results.forEach(p -> System.out.println(p.getProductName()+" "+p.getProductPrice()));
		
	}
	
	@Test
	public void testFindByProductDescriptionContains() {
		
		Pageable pageable = PageRequest.of(0, 5, Sort.by(Order.asc("productPrice"),Order.desc("productDescription")));
		
		repos.findByProductDescriptionContains(pageable, "Apple").forEach(p -> System.out.println(p.getProductName()+" "+p.getProductPrice()));;
	}

}
