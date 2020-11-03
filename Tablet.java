package com.medicine;

import java.sql.Date;

public class Tablet extends Medicine{

	public Tablet(float price, Date date) {
		super(price, date);
	}

	void displayLabel() {
		System.out.println("Store ina acool and dry place");
	}

}
