package com.hsbc.collection_Assignment;

public class SalesEmp extends Emp_ABC{
	
	private int sales ;
	
	public SalesEmp(int id, int ph, String name, String email, String dept, String desig, Date doj , int sales) {
		super(id, ph, name, email, dept, desig, doj);
		
		this.sales = sales;
	}


	void CalSal() {
		
		double Sal =  (0.10 *sales) ;
		System.out.println("Salary of sales Employee is "+ super.getName() + " " + Sal );
		
	}

}
