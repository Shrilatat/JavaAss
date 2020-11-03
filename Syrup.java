package com.medicine;

import java.sql.Date;

public class Syrup extends Medicine{

	public Syrup(double price, Date date) {
		super(price, date);
	}

	void displayLabel() {
		System.out.println("Shake well before use");
	}

}
