package com.Employee;

import java.sql.Date;

public class ContractEmp extends Emp_ABC {
	
	private int hrs, rate;

	public ContractEmp(int id, String name, String email, String ph, String dept, String desig, Date date, int hrs, int rate) {
		super(id, name, email, ph, dept, desig, date);
		this.hrs = hrs;
		this.rate = rate;
	}

	void calculateSalary() {
		double sal = hrs * rate;
		System.out.println("Salary of Contract Employee " + super.getName() + " is " + sal);
	}

}
