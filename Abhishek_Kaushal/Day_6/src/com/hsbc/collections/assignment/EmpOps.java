package com.hsbc.collections.assignment;

import java.util.LinkedList;

import com.hsbc.collections.Emp;

public class EmpOps  {
	LinkedList<Emp> employees = new LinkedList<>();
	
	public void addEmp(Emp emp)
	{
		employees.add(emp);
	}
	
	public void deleteEmp(int empNo)
	{
		for(Emp emp: employees)
		{
			if(emp.getEmpNo()==empNo)
			{
				employees.remove(employees.indexOf(emp));
				return;
			}
		}
		System.out.println("No employee found");
	}
	
	public void displayAllEmps()
	{
		for(Emp emp:employees)
		{
			System.out.println(emp);
		}
	}
	
	public void incrSal()
	{
		for(Emp emp: employees)
		{
			emp.setSal(emp.getSal()*1.1f);
		}
	}
	
	public void displayEmpDetails(int id)
	{
		for(Emp emp:employees)
		{
			if(emp.getEmpNo() == id)
			{
				System.out.println(emp);
				return;
			}
		}
		System.out.println("No employee found");
	}
	
	public void displayEmpWithDesig(String desig)
	{
		for(Emp emp : employees)
		{
			if(emp.getDesig().equals(desig))
			{
				System.out.println(emp);
			}
		}
	}
}
