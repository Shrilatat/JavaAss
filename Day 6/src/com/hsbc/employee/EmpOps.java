package com.hsbc.employee;

import java.util.Iterator;
import java.util.LinkedList;

public class EmpOps {
	
	LinkedList<Emp> emplist = new LinkedList<Emp>();
	
	
	public void addEmp(Emp emp) 
	{
		emplist.add(emp);
	}
	
	public void deleteEmp(int empNo) 
	{
		for(Iterator it = emplist.iterator(); it.hasNext(); )
		{
			Emp e = (Emp) it.next();
			if(e.getEmpNo() == empNo)
				it.remove();
		}
	}
	
	public void displayAll() {
		for(Emp e : emplist)
			System.out.println(e);
	}
	
	public void incrsal() {
		for(Iterator it = emplist.iterator(); it.hasNext(); )
		{
			Emp e = (Emp) it.next();
			double temp = (e.getSal() + (e.getSal()*0.1));
			e.setSal(temp);
			System.out.println(e);
			
		}
	}
	
	public void displayEmpDetails(int id) {
		for(Iterator it = emplist.iterator(); it.hasNext(); )
		{
			Emp e = (Emp) it.next();
			if(e.getEmpNo() == id)
				System.out.println(e);
		}
	}
	
	public void displayEmpWithDesig(String desig) {
		for(Iterator it = emplist.iterator(); it.hasNext(); )
		{
			Emp e = (Emp) it.next();
			if((e.getDesig()).equals(desig))
				System.out.println(e);
		}
	}

}
