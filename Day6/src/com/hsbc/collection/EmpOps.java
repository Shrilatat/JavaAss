package com.hsbc.collection;
import java.util.*;
public class EmpOps {
	private List<Emp> emps = new ArrayList<>();
	public void addEmp(Emp emp)
	{
		emps.add(emp);
	}
	public void deleteEmp(int empNo) {
		Iterator<Emp> i = emps.iterator();
		System.out.println("====idelete opeation======");
		while(i.hasNext())
		{
			Emp p = i.next();
			int id = p.getEmpNo();
			if(id == empNo)
			{
				i.remove();
			}
		}
	}
	public void displayAllEmps()
	{
		for(Emp e: emps)
	    {
	    	System.out.println(e);
	    }
		
	}
	public void incrSal() {
		Iterator<Emp> i = emps.iterator();
		while(i.hasNext()) {
			Emp e = i.next();
			System.out.println(e.getSal()*1.1);
		}
	}
	public void displayEmpDetails(int id)
	{
		Iterator<Emp> i = emps.iterator();
		while(i.hasNext()) {
			Emp e = i.next();
			if(e.getEmpNo() == id)
			{
				System.out.println(e);
				break;
			}
		}
	}
	public void displayEmpWithDesig(String design) {
		 System.out.println("All the employees with desig "+design+" are:");
		 for(Emp e : emps)
		 {
			 if((e.getDesign()).equals(design)) {
				 System.out.println(e);
				 }
			 }
	 }
	
}
