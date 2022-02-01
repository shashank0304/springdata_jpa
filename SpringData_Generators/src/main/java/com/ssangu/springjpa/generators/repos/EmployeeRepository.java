package com.ssangu.springjpa.generators.repos;

import org.springframework.data.repository.CrudRepository;

import com.ssangu.springjpa.generators.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
