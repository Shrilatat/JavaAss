package com.hsbc.AssignCollect;

import java.util.Date;

public class SaleEmp extends AbcEmp{

	int montsale ;
	
	public SaleEmp(int id, String name, int pno, String email, String dept, String designation, Date date,
			int montsale) {
		super(id, name, pno, email, dept, designation, date);
		this.montsale = montsale;
	}
	
	@Override
	public void calcSal() {
		float salary = (float)(0.1 * montsale);
		System.out.println("salary of Sales emp : " + salary );
		
	}
	
	public String despDetails()
	{
		return("Sales Emp : " + super.despDetails());
	}
	
	
	
	
	
	
}
