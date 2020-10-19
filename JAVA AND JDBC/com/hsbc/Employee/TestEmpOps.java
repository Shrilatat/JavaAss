package com.hsbc.Employee;

public class TestEmpOps {
	public static void main(String[] args) {
		EmpOps e = new EmpOps();
		
		e.addEmp(new Emp(1,"Vishnu",10000,"TSE"));
		e.addEmp(new Emp(2,"Pushkar",20000,"SE"));
		e.addEmp(new Emp(3,"Ujjwal",30000,"ASE"));
		e.deleteEmp(1);
		e.incrSal();
		
		e.displayEmpDetails(3);
		
		e.displayEmpWithDesig("SE");
		
		
	}
}
