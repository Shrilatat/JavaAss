package com.hsbc.collects;

public class TestEmpOps {
	public static void main(String[] args) {
		EmpOps e=new EmpOps();
		e.addEmp(new Emp(1,"Parth",1000,"TSE"));
		e.addEmp(new Emp(2,"pratham",2000,"SSE"));
		e.addEmp(new Emp(3,"aditi",3000,"JSD"));
		e.addEmp(new Emp(4,"vishnu",4000,"JSD"));
		
		e.deleteEmp(2);
		
		e.displayAllEmps();
		
		e.incrSal();
		
		e.displayEmpDetails(3);
		
		e.displayEmpWithDesig("TSE");
	}
}
