package com.ssangu.springjpa.componentMapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ssangu.springjpa.componentMapping.entities.Address;
import com.ssangu.springjpa.componentMapping.entities.Employee;
import com.ssangu.springjpa.componentMapping.repos.EmployeeRepository;

@SpringBootTest
class SpringDataComponentMappingApplicationTests {

	@Autowired
	EmployeeRepository repos;
	
	@Test
	public void testCreateEmployee() {
			
		Employee emp = new Employee();
		emp.setName("Jim");
		
		Address address = new Address();
		address.setCity("Sydney");
		address.setCountry("Australia");
		address.setState("NSW");
		address.setStreetAddress("786 North Street");
		address.setZipCode("9087");
		
		emp.setAddress(address);
		
		repos.save(emp);
	}
}
