package com.hsbc.collection_Assignment;



public abstract class Medicine {
	
	private float price;
	Date d ;
	
	
	
	public Medicine(float price, Date string) {
		super();
		this.price = price;
		this.d = string;
	}



	public void getDetails() {
		System.out.println( "Medicine [price=" + price + ", d=" + d + "]");
	}



	abstract void displayLabel();
	

}
