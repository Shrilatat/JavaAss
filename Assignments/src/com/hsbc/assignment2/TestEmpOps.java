package com.hsbc.assignment2;

public class TestEmpOps {
	
	public static void main(String[] args) {
		EmpOps op=new EmpOps();
		
		op.addEmp(new Emp(1,25000,"aditya","Trainne"));
		op.addEmp(new Emp(2,35000,"sid","junior engineer"));
		op.addEmp(new Emp(3,25000,"pratik","Trainne"));
		//op.displayEmp();
		
		//op.deleteEmp(3);
		//op.displayEmp();
		
		op.incSalary();
		//op.displayEmp();
		
		//op.displayEmpDetails(2);
		
		op.displayEmpWithDesig("junior engineer");
		
	}

}
