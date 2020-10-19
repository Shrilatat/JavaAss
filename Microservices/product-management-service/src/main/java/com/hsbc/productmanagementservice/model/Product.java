package com.hsbc.productmanagementservice.model;

public class Product {
	String productName,description;
	double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, String description, double price) {
		super();
		this.productName = productName;
		this.description = description;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
