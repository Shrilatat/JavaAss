package com.hsbc.AssignCollect;

import java.util.Date;

public class contEmp extends AbcEmp{
	
	int houW;
	float rate ;
	
   

	public contEmp(int id, String name, int pno, String email, String dept, String designation, Date date, int houW,
			float rate) {
		super(id, name, pno, email, dept, designation, date);
		this.houW = houW;
		this.rate = rate;
	}

	@Override
	public void calcSal() 
	{
		float salary = (float)(houW * rate);
		System.out.println("salary of ContEmp :" + salary);
	}
	
	public String despDetails()
	{
		return("Cont Emp : " + super.despDetails());
	}
	
	
}
