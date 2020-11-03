package com.Employee;

import java.sql.Date;

public class SalariedEmp extends Emp_ABC{
	
	private int basicSalary;

	public SalariedEmp(int id, String name, String email, String ph, String dept, String desig, Date date, int basicSalary) {
		super(id, name, email, ph, dept, desig, date);
		this.basicSalary = basicSalary;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	void calculateSalary() {
		double sal = 1.3 * basicSalary;
		System.out.println("Salary of " + super.getName() + " : " + sal);
		
	}

}
