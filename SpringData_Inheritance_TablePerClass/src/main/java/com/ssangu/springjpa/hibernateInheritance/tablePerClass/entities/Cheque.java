package com.ssangu.springjpa.hibernateInheritance.tablePerClass.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cheque_tableperclass")
public class Cheque extends Payment {
	
	@Column(name = "chequenumber")
	private String chequeNumber;

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
}
