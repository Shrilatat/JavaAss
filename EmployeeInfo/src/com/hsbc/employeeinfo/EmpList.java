package com.hsbc.employeeinfo;

import java.util.ArrayList;
import java.util.List;

public class EmpList {
	List<Employee> emplist = new ArrayList<>();
	public void addEmp(Employee e) {
		emplist.add(e);
		System.out.println(emplist);
	}
	
	public List<Employee> returnEmp() {
		return emplist;
	}
}
