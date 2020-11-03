package com.Employee;

import java.sql.Date;

public class SalesEmp extends Emp_ABC{
	
	private int sales;

	public SalesEmp(int id, String name, String email, String ph, String dept, String desig, Date date, int sales) {
		super(id, name, email, ph, dept, desig, date);
		this.sales = sales;
	}

	void calculateSalary() {
		double sal = (0.10 * sales);
		System.out.println("Salary of Sales Employee " + super.getName()  + " is : " + sal);
	}

}
