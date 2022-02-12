package com.ssangu.springjpa.hibernateInheritance.tablePerClass.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "card_tableperclass")
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
