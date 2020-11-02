package com.hsbc.AssignCollect;

import java.util.Date;

public class Tablet extends MedicineManf{
	
	
	public Tablet(int price, Date date) {
		super(price, date);
	}

	public Tablet() {
		super();
	}
    
	public void displayLabel() {
		
		System.out.println("Tablet : store in a dry cool place");
		
	}

}
