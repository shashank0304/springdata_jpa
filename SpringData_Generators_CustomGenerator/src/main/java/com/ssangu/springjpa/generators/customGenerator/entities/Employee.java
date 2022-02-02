package com.ssangu.springjpa.generators.customGenerator.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employee_customgenerator")
public class Employee {
	
	@Id
	@GenericGenerator(name = "emp_id", strategy = "com.ssangu.springjpa.generators.customGenerator.idGenerator.CustomIdGenerator")
	@GeneratedValue(generator = "emp_id")
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
