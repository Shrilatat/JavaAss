package com.hsbc.collection_Assignment;

public class Salaried_Emp  extends Emp_ABC{

	private int basicSal;
	public Salaried_Emp(int id, int ph, String name, String email, String dept, String desig, Date doj ,int basicSal ) {
		super(id, ph, name, email, dept, desig, doj);
		this.basicSal = basicSal;
	}

	void CalSal() {
		
		double sal = 1.3 * basicSal;
		
		System.out.println("Salary of  "+ super.getName() +"  " + sal);
		
	}

}
