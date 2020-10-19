package com.hsbc.productcatalogservice.model;

public class Product {
	private String productName;
	private String catalog;
	private double price;

	public Product() {
	}

	public Product(String productName, String catalog, double price) {
		super();
		this.productName = productName;
		this.catalog = catalog;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
