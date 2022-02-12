package com.ssangu.springjpa.hibernateInheritance.singleTableStrategy.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class Cheque extends Payment{
	
	@Column(name = "chequenumber")
	private String chequeNumber;

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	
}
