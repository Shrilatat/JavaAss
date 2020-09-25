package com.hsbc.collection;

import java.util.*;
public class TestEmpOps extends EmpOps{
	public static void main(String[] args) {
		//Emp emp = new Emp();
		EmpOps eops = new EmpOps();
		eops.addEmp(new Emp(1,"Mauli",50000, "TSE"));
		eops.addEmp(new Emp(2,"Shivam",50300, "AGM"));
		eops.addEmp(new Emp(3,"Shinu",50400, "DSE"));
		eops.addEmp(new Emp(4,"Minion",50500, "TSE"));
		eops.addEmp(new Emp(5,"Muuu",50800, "SE"));
		//System.out.println(eops);
		System.out.println("----all items-----");
		eops.displayAllEmps();
		eops.deleteEmp(2);
		eops.displayAllEmps();
		eops.displayEmpWithDesig("TSE");
		System.out.println("====increament salary======");
		eops.incrSal();
		System.out.println("====details of employ======");
		eops.displayEmpDetails(1);

	}
}
