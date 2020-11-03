package com.hsbc.AssignCollect;

import java.util.Date;

public class TestMedicine {
	
	public static void main(String[] args) {
		
		MedicineManf   Tab = new Tablet(25 , new Date());
		MedicineManf  Syr = new Syrup(48 , new Date());
		MedicineManf  Oin = new Ointment(96 , new Date());
		
		MedicineManf[] med = {Tab , Syr , Oin};
		
        for(MedicineManf m : med)
        {
        	m.displayLabel();
        	System.out.println(m);
        }
		
		
		
	}

}
