package com.ssangu.springjpa.pagingSorting.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_pagingsorting")
public class Product {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	@Column(name = "name")
	private String productName;
	@Column(name = "description")
	private String productDescription;
	@Column(name = "price")
	private Double productPrice;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	
	
}
