package com.hsbc.collection_Assignment;


public class TestMedicine {

	public static void main(String[] args) {
		
		Medicine a = new Tablet(101, new Date(2020,11,23));
		Medicine b = new Ointment(102, new Date(2020,01,23));
		Medicine c = new Syrup(103, new Date(2020,01,23));
		
		Medicine[] M = {a,b,c};
		
		for(Medicine t : M)
		{
			t.getDetails();
			t.displayLabel();
			System.out.println(" ");
		}
		
		
	}
	
}
