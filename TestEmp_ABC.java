package com.Employee;

import java.sql.Date;

public class TestEmp_ABC {

	public static void main(String[] args) {
		Emp_ABC a = new SalariedEmp(15024012, "Tanu", "tanu@xyz", "8423793652", "IT COO", "TSE", new Date(2020, 12, 10), 75000);
		Emp_ABC b = new ContractEmp(15024010, "Utsav", "utsav@xyz", "8424512422", "IT", "ghdn", new Date(2003, 1, 12), 56, 1000);
		Emp_ABC c = new SalesEmp(15024012, "Anu", "anu@xyz", "8422572252", "COO", "hdE", new Date(2010, 12, 1), 405000);

		Emp_ABC[] emp = {a,b,c};
		
		for(Emp_ABC i : emp) {
			i.displayEmpDetails();
			i.calculateSalary();
			System.out.println(" ");
		}
	}

}
