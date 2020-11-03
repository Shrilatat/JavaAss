package com.medicine;

import java.sql.Date;

public class TestMedicine {
	
	public static void main(String[] args) {
		Medicine m1 = new Tablet(101, new Date(2003, 12, 5));
		Medicine m2 = new Ointment(102, new Date(2020, 12, 11));
		Medicine m3 = new Syrup(150, new Date(2010, 10, 1));
		
		Medicine[] M = {m1, m2, m3};
		for(Medicine t : M) {
			t.displayLabel();
			t.getDetails();
			System.out.println(" ");
		}
	}
}
