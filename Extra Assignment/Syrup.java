package com.demo;

public class Syrup extends Medicine {

	public Syrup(int price, Date exp) {
		super(price, exp);
		// TODO Auto-generated constructor stub
	}

	public void displayLabel()
	{
		System.out.println("keep out of reach of children");
	}
}
