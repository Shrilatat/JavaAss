package com.hsbc.productcategoryservice.model;

public class Category {
	private String categoryName;

	public Category() {
	}

	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCatName(String categoryName) {
		this.categoryName = categoryName;
	}

}
