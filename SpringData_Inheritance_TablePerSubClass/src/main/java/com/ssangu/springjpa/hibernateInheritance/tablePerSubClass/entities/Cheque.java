package com.ssangu.springjpa.hibernateInheritance.tablePerSubClass.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "cheque_tablepersubclass")
@PrimaryKeyJoinColumn(name = "id")
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
