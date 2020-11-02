package com.hsbc.AssignCollect;

import java.util.Date;

public class Ointment extends MedicineManf{
	
	

	public Ointment(int price , Date date) {
		super(price,date);
	}

	@Override
	public void displayLabel() {
		
		System.out.println("Ointment : for externel use only");
		
	}
	

}
