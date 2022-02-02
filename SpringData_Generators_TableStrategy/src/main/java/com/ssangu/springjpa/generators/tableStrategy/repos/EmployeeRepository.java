package com.ssangu.springjpa.generators.tableStrategy.repos;

import org.springframework.data.repository.CrudRepository;

import com.ssangu.springjpa.generators.tableStrategy.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
