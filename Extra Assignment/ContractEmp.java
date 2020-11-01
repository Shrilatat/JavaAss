package com.demo;

public class ContractEmp extends Employee {
	private int rate;
	private double hrs;
	
	public ContractEmp(int id, String name, String pNo, String email, String dept, String desig, Date doj, int rate,
			double hrs) {
		super(id, name, pNo, email, dept, desig, doj);
		this.rate = rate;
		this.hrs = hrs;
	}
	
	public void calSal()
	{
		double total = hrs*rate;
		System.out.println("Salary: "+total);
	}
}
