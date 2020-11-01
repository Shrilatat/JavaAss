package com.demo;

public class SalesEmp extends Employee {
	
	private double monthlyS;

	public SalesEmp(int id, String name, String pNo, String email, String dept, String desig, Date doj,
			double monthlyS) {
		super(id, name, pNo, email, dept, desig, doj);
		this.monthlyS = monthlyS;
	}
	
	public void calSal()
	{
		double total = 0.1*monthlyS;
		System.out.println("Salary: "+total);
	}

}
