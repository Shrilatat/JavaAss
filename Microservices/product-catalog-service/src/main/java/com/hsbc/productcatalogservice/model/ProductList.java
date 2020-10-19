package com.hsbc.productcatalogservice.model;

import java.util.List;

public class ProductList {
	private List<Product> plist;

	public ProductList(List<Product> plist) {
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
