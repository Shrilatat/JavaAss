package com.demo;

public class Tablet extends Medicine {
	
	
	
	public Tablet(int price, Date exp) {
		super(price, exp);
	}

	public void displayLabel()
	{
		System.out.println("store in cool dry place");
	}
}
