package com.ssangu.springjpa.hibernateInheritance.tablePerSubClass.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "creditcard_tablepersubclass")
@PrimaryKeyJoinColumn(name = "id")
public class CreditCard extends Payment {
	
	@Column(name = "cardnumber")
	private String cardNumber;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
}
