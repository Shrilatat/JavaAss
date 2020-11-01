package com.hsbc.collection_Assignment;



public class Ointment extends Medicine{

	public Ointment(float price, Date date) {
		super(price, date);
	}

	void displayLabel() {
		
		System.out.println("For external use only ");
		
	}

}
