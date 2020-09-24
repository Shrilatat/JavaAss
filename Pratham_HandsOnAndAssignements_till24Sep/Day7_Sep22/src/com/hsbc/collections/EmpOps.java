package com.hsbc.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class EmpOps {
	LinkedList<Emp> employeeList = new LinkedList<Emp>();
	
	public void addEmp(Emp employee) {
		employeeList.add(employee);
	}
	
	public void deleteEmp(int empno) {
		for(Emp e: employeeList) {
			int id = e.getEmpNo();
			if(id==empno) {
				employeeList.remove(e);
			}
			else
				System.out.println("Employee not found");
		}
	}
	public void displayAllEmps() {
		for(Emp e: employeeList) {
			System.out.println(e);
		}
	}
	
	public void incrSal() {
		Iterator<Emp> itr = employeeList.iterator();
		while(itr.hasNext()) {
			Emp e= itr.next();
			float incSal= e.getSal()+(e.getSal()*0.1f);
			e.setSal(incSal);
		}
	}
	
	public void displayEmpDetails(int id) {
		for(Emp e: employeeList) {
			if(e.getEmpNo()==id) {
				System.out.println(e.getEmpName());
				System.out.println(e.getEmpNo());
				System.out.println(e.getSal());
				System.out.println(e.getDesig());
				break;
			}
			else
				System.out.println("Employee not found");
		}
	}
	
	public void displayEmpWithDesig(String desig) {
		for(Emp e: employeeList) {
			
			if(e.getDesig()==desig) {
				System.out.println("The requested employee details are :");
				System.out.println(e.getEmpName());
				System.out.println(e.getEmpNo());
				System.out.println(e.getSal());
				System.out.println(e.getDesig());
				break;
			}
			else
				System.out.println("Employee not found");
		}
	}
	
}
