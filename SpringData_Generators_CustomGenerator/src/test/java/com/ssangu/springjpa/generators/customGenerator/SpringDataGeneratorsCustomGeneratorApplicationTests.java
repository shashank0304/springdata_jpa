package com.ssangu.springjpa.generators.customGenerator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ssangu.springjpa.generators.customGenerator.entities.Employee;
import com.ssangu.springjpa.generators.customGenerator.repos.EmployeeRepository;

@SpringBootTest
class SpringDataGeneratorsCustomGeneratorApplicationTests {

	
	@Autowired
	EmployeeRepository repos;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreateEmployee() {
		
		Employee emp = new Employee();
		emp.setName("Jim");
		repos.save(emp);
		
	}

}
