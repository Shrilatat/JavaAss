package com.demo;

public class TestMedicine {
public static void main(String[] args) {
	
	Medicine[] med = {new Tablet(100, new Date(20,06,2022)), new Syrup(200, new Date(10,06,2030)), new Ointment(250, new Date(15,12,2025))};

	for(Medicine m : med)
	{
		m.getDetails();
		m.displayLabel();
	}
}
}