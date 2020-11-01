package com.demo;

public class SalEmp extends Employee {
	
	private double basic;
	
	public SalEmp(int id, String name, String pNo, String email, String dept, String desig, Date doj, int basic) {
		super(id, name, pNo, email, dept, desig, doj);
		this.basic = basic;
	}

	public void calSal()
	{
		double total = 1.3*basic;
		System.out.println("Salary: "+total);
	}

}
