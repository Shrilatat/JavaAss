package com.hsbc.collection_Assignment;

public class ContractEmp extends Emp_ABC{
	
	private int hrs,rate;
	
	public ContractEmp(int id, int ph, String name, String email, String dept, String desig, Date doj , int hrs , int rate ) {
		super(id, ph, name, email, dept, desig, doj);
	
		this.hrs = hrs;
		this.rate = rate;
		
	}

	void CalSal() {
		
			double sal = hrs * rate;
			System.out.println("Salary of sales Employee is "+ super.getName() + " " + sal );
	}

}
