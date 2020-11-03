package com.medicine;

import java.sql.Date;

public class Ointment extends Medicine {

	public Ointment(double price, Date date) {
		super(price, date);
	}

	void displayLabel() {
		System.out.println("for external use only");
	}

}
