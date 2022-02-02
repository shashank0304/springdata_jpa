package com.ssangu.springjpa.generators.tableStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "employee_tablestrategy")
public class Employee {
	
	@Id
	@Column(name = "employeeid")
	@TableGenerator(name = "employee_gen", table = "gen_table", pkColumnName = "gen_name",valueColumnName = "gen_id", allocationSize = 30)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen")
	private int id;
	@Column(name = "employeename")
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
