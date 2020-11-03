package com.medicine;

import java.sql.Date;

public abstract class Medicine {

	private double price;
	Date date;
	
	public Medicine() {}
	
	public Medicine(double price, Date date) {
		super();
		this.price = price;
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void getDetails() {
		System.out.println("Medicine [price=" + price + ", date=" + date + "]");
	}
	
	abstract void displayLabel();
	
}
