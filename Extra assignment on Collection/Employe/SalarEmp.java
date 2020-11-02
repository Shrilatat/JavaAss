package com.hsbc.AssignCollect;

import java.util.Date;

public class SalarEmp extends AbcEmp {

	float basicP;
	

	public SalarEmp(int id, String name, int pno, String email, String dept, String designation, Date date,
			float basicP) {
		super(id, name, pno, email, dept, designation, date);
		this.basicP = basicP;
	}

	@Override
	public void calcSal() {
		float salary = (float) (1.3*basicP);
		System.out.println("salary of Salaried Emp :" + salary);
	}
	
	public String despDetails()
	{
		return("Salaried Emp : " + super.despDetails());
		
	}
	
	

}
