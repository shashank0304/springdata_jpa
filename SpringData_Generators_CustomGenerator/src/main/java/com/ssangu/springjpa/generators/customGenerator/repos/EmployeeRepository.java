package com.ssangu.springjpa.generators.customGenerator.repos;

import org.springframework.data.repository.CrudRepository;

import com.ssangu.springjpa.generators.customGenerator.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
