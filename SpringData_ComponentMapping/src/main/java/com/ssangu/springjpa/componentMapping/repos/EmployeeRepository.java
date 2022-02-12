package com.ssangu.springjpa.componentMapping.repos;

import org.springframework.data.repository.CrudRepository;

import com.ssangu.springjpa.componentMapping.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
