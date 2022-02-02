package com.ssangu.springjpa.generators.tableStrategy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ssangu.springjpa.generators.tableStrategy.repos.EmployeeRepository;

@SpringBootTest
class SpringDataGeneratorsTableStrategyApplicationTests {
	
	@Autowired
	EmployeeRepository repos;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreateEmployee() {
		
		Employee emp = new Employee();
		emp.setName("Kim");
		repos.save(emp);
	}

}
