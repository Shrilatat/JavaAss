package com.hsbc.productmanagementservice.model;

public class Product {
	String pname, descp;
	double price;
	
	
	
	public Product(String pname, String descp, double price) {
		super();
		this.pname = pname;
		this.descp = descp;
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDescp() {
		return descp;
	}
	public void setDescp(String descp) {
		this.descp = descp;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pname=" + pname + ", descp=" + descp + ", price=" + price + "]";
	}
	
	 
}
