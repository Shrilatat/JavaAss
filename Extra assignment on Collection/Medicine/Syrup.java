package com.hsbc.AssignCollect;

import java.util.Date;

public class Syrup extends MedicineManf {
	

	public Syrup(int price, Date date) {
		super(price, date);
	}

	@Override
	public void displayLabel() {
		
		System.out.println("Syrup : Shake it well before you use");
	}
     
}
