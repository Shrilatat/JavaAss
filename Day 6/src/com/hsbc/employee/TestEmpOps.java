package com.hsbc.employee;

public class TestEmpOps  {
	
	public static void main(String[] args) {
		EmpOps obj = new EmpOps();
		obj.addEmp(new Emp(1 , "Chaitra" , 10000 , "SSE"));
		obj.addEmp(new Emp(2 , "Ritu" , 5000 , "SE"));
		obj.addEmp(new Emp(3 , "Misha" , 2000 , "SE"));
		obj.addEmp(new Emp(4 , "Rahul" , 2000 , "TSE"));
		
		obj.deleteEmp(2);
		obj.incrsal();
		obj.displayEmpDetails(3);
		obj.displayEmpWithDesig("SSE");
	}

}
