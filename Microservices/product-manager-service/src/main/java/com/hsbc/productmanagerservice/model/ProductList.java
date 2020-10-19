package com.hsbc.productmanagerservice.model;

import java.util.List;

public class ProductList {
	private List<Product> plist;

	public ProductList(List<Product> plist) {
		super();
		this.plist = plist;
	}

	public ProductList() {

	}

	public List<Product> getPlist() {
		return plist;
	}

	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}

}
