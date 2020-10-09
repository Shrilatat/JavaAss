package com.hsbc;

public class TestEmpOps {
public static void main(String[] args) {
	EmpOps obj1=new EmpOps();
	obj1.addEmp(new Emp1(1,"Rohan",1000,"TSE"));
	obj1.addEmp(new Emp1(3,"Rohit",1500,"TSE"));
	obj1.addEmp(new Emp1(2,"Ronak",1700,"SSE"));
	obj1.addEmp(new Emp1(4,"Rahim",1300,"ASE"));
	obj1.deleteEmp(1);
	obj1.displayAllEmps();
	obj1.incrsal();
	obj1.displayEmpDetails(2);
	obj1.displayEmpWithDesig("TSE");
}
}
