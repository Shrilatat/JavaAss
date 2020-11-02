package com.demo;

public class Ointment extends Medicine {

	public Ointment(int price, Date exp) {
		super(price, exp);
		// TODO Auto-generated constructor stub
	}
	
	public void displayLabel()
	{
		System.out.println("for external use only");
	}

}
