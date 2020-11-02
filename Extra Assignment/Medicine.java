package com.demo;

public abstract class Medicine {
	private int price;
	private Date exp;
	
	public Medicine(int price, Date exp) {
		super();
		this.price = price;
		this.exp = exp;
	}

	public void getDetails()
	{
		System.out.println("Price: "+price);
		System.out.println("Expiry "+exp);
	}
	
	abstract public void displayLabel();
}
