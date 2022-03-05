package com.ssangu.springjpa.finders;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.ssangu.springjpa.finders.entities.Product;
import com.ssangu.springjpa.finders.repos.ProductRepository;

@SpringBootTest
class SpringDataFindersApplicationTests {
	
	@Autowired
	ProductRepository repos;
	@Autowired
	EntityManager em;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void createProduct() {
		
		Product product = new Product();
		product.setName("Hair Dryer");
		product.setDesc("Philips Hair Dryer");
		product.setPrice(100d);
		repos.save(product);
	}
	
	@Test
	public void testFindProductByName() {
		
		List<Product> products = repos.findByName("TV");
		products.forEach(p -> System.out.println(p.getDesc()+" "+p.getPrice()));
	}
	
	@Test
	public void testFindProductByNameAndDesc() {
		
		repos.findByNameAndDesc("Refridgerator", "LG Fridge").forEach(p -> System.out.println(p.getDesc()+" "+p.getPrice()));
	}
	
	@Test
	public void testFindProductByPriceGreaterThan() {
		
		repos.findByPriceGreaterThan(200d).forEach(p -> System.out.println(p.getDesc()+" "+p.getPrice()));
	}
	
	@Test
	public void testFindProductByDescContains() {
		
		repos.findByDescContains("Apple").forEach(p -> System.out.println(p.getDesc()+" "+p.getPrice()));
	}
	
	@Test
	public void testFindProductByPriceBetween() {
		
		repos.findByPriceBetween(500d, 1500d).forEach(p -> System.out.println(p.getDesc()+" "+p.getPrice()));
	}
	
	@Test
	public void testFindByIdsIn() {
		List<Integer> idList = new ArrayList<Integer>();
		idList.add(1);
		idList.add(2);
		idList.add(4);
		repos.findByIdIn(idList).forEach(p -> System.out.println(p.getDesc()+" "+p.getPrice()));;
	}
	
	@Test
	@Transactional
	public void testFindProductByIdFirstLevelCache() {
			
		Product product = repos.findById(1).get();
		
		repos.findById(1);
		
		Session session = em.unwrap(Session.class);
		session.evict(product);
		repos.findById(1);
	}
}
