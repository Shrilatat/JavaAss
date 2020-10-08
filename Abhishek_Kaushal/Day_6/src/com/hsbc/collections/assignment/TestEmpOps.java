package com.hsbc.collections.assignment;

import com.hsbc.collections.Emp;

public class TestEmpOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpOps emp1 = new EmpOps();
		emp1.addEmp(new Emp(5,"Abhishek",1000,"TSE"));
		emp1.addEmp(new Emp(6,"Aditi",2000,"SE"));
		emp1.addEmp(new Emp(7,"Ujjwal",5000,"SSE"));
		emp1.addEmp(new Emp(8,"Smriti",1500,"TSE"));
		
		emp1.displayAllEmps();
		
		emp1.deleteEmp(5);
		System.out.println();
		emp1.displayAllEmps();
		
		emp1.incrSal();
		System.out.println();
		emp1.displayAllEmps();
		
		System.out.println();
		emp1.displayEmpDetails(7);
		 
		System.out.println();
		emp1.displayEmpWithDesig("TSE");

	}

}
