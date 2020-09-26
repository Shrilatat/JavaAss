package com.hsbc.assignment2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmpOps {

	List<Emp> list = new LinkedList<>();
	
	public void addEmp(Emp emp) {
		list.add(emp);
	}
	
	public void deleteEmp(int empNo) {
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Emp emp = (Emp) iterator.next();
			if(emp.getEmpNo() == empNo)
				iterator.remove();
		}
	}
	
	public void displayAllEmps() {
		for (Emp emp : list) {
			System.out.println(emp);
		}
	}
	
	public void incrSal() {
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Emp emp = (Emp) iterator.next();
			int sal = (int) (emp.getSal()*1.1);
			emp.setSal(sal);
			//System.out.println(sal);
		}
	}
	
	public void displayEmpDetails(int id) {
		for (Emp emp : list) {
			if(emp.getEmpNo() == id)
				System.out.println(emp);
		}
	}
	
	public void displayEmpWithDesig(String desig) {
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Emp emp = (Emp) iterator.next();
			if(emp.getDesignation().equals(desig))
				System.out.println(emp);
		}
	}
}
