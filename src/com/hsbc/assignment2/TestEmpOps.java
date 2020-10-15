package com.hsbc.assignment2;

public class TestEmpOps {
	public static void main(String[] args) {
		EmpOps e = new EmpOps();
		e.addEmp(new Emp(111,"aaa",50000,"TSE"));
		e.addEmp(new Emp(112,"bbb",90000,"Manager"));
		e.addEmp(new Emp(113,"ccc",25000,"HR"));
		e.displayAllEmps();
		
		e.deleteEmp(112);
		System.out.println("After Removal of Employee");
		e.displayAllEmps();
		
		System.out.println("Increment Salary");
		e.incrSal();
		e.displayAllEmps();
		
		System.out.println("Employee details with Emp ID 113");
		e.displayEmpDetails(113);
		
		System.out.println("Employee details with Designation TSE");
		e.displayEmpWithDesig("TSE");
	}
}
