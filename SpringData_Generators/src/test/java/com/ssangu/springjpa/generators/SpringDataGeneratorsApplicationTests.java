package com.ssangu.springjpa.generators;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ssangu.springjpa.generators.entities.Employee;
import com.ssangu.springjpa.generators.repos.EmployeeRepository;

@SpringBootTest
class SpringDataGeneratorsApplicationTests {
	
	@Autowired
	EmployeeRepository repos;
	
	@Test
	public void testCreateEmployee() {
		
		Employee emp = new Employee();
		//emp.setEmployeeId(1);
		emp.setEmployeeName("John");
		repos.save(emp);
	}
}
