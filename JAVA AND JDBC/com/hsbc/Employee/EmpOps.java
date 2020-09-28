package com.hsbc.Employee;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmpOps {
	List<Emp> empList = new LinkedList<>();
	
	public void addEmp(Emp emp){
		empList.add(emp);
	}
	
	public void deleteEmp(int empno){
		for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
			Emp emp = (Emp) iterator.next();
			if(emp.getEmpNo() == empno)
				iterator.remove();
		}
	}
	
	public void displayAllEmps()
	{
		for (Emp emp : empList) {
			System.out.println(emp);
		}
	}
	
	public void incrSal(){
		for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
			Emp emp = (Emp) iterator.next();
			double temp = (emp.getSal() + (emp.getSal()*0.1));
			emp.setSal(temp);
			System.out.println(emp);
		}
	}
	
	public void displayEmpDetails(int id){
		for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
			Emp emp = (Emp) iterator.next();
			if(emp.getEmpNo() == id)
				System.out.println(emp);
		}
	}
	
	public void displayEmpWithDesig(String desig){
		for (Iterator iterator = empList.iterator(); iterator.hasNext();) {
			Emp emp = (Emp) iterator.next();
			if((emp.getDesig()).equals(desig))
				System.out.println(emp);
		}
	}
	
	
}
