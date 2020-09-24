package com.hsbc.collections;

public class TestEmpOps {
	public static void main(String[] args) {
		EmpOps employees = new EmpOps();
		
		employees.addEmp(new Emp(1,"A",23400.0f,"TSE"));
		employees.addEmp(new Emp(2,"B",43000.0f,"SSE"));
		employees.displayAllEmps();
		employees.displayEmpDetails(1);
		employees.displayEmpWithDesig("B");
		employees.deleteEmp(2);
	}
}
