package com.ssangu.springjpa.hibernateInheritance.singleTableStrategy.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment_singletablestrategy")
@DiscriminatorColumn(name = "pmode")
public abstract class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private Double amount;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
}
