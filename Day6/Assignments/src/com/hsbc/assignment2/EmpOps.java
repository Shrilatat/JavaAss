/**
 * 
 */
package com.hsbc.assignment2;

import java.util.LinkedList;

/**
 * @author siddhant shah
 *
 */
public class EmpOps {
	
	LinkedList<Emp> list=new LinkedList<>();
	public void addEmp(Emp emp)
	{
		list.add(emp);
	}
	
	public void deleteEmp(int empno)
	{
		for (Emp emp : list) {
			if(emp.getEmpno()==empno)
			{
				list.remove(emp);
				return;
			}
			
		}
		System.out.println("no emp in list");
	}
	
	public void displayEmp()
	{
		for (Emp emp : list) {
			System.out.println(emp);
		}
	}
	
	public void incSalary()
	{
		for (Emp emp : list) {
			int sal=emp.getSal();
				sal=(int)(sal+(0.1*sal));
			emp.setSal(sal);
		}
	}
	
	public void displayEmpDetails(int id)
	{
		for (Emp emp : list) {
			if(emp.getEmpno()==id)
			{
				System.out.println(emp);
				return;
			}
		}
		System.out.println("Employee not in list");
	}
	
	public void displayEmpWithDesig(String design)
	{
		for (Emp emp : list) {
			if(emp.getDesignation()==design)
				System.out.println(emp);
			
		}
	}
	
}
