package com.hsbc.collections;

import java.util.LinkedList;
import java.util.List;

public class TestEmpOps {

	public static void main(String[] args) {
		
		EmpOps obj = new EmpOps();
		
		obj.addEmp(new Emp(111,"Amisha",50000,"TSE"));
		obj.addEmp(new Emp(112,"Mauli",40000,"ASE"));
		obj.addEmp(new Emp(113,"Aditi",30000,"SSE"));
		obj.addEmp(new Emp(114,"Parth",20000,"JSE"));
		obj.addEmp(new Emp(115,"Pratham",10000,"PL"));
		
		obj.deleteEmp(114);
		
		obj.displayAllEmps();
		
		obj.incrSal();
		
		obj. displayEmpDetails(111);
		
		obj.displayEmpWithDesig("ASE");
		
	}

}
