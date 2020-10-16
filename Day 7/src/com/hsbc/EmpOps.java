package com.trg;

import java.util.Iterator;
import java.util.LinkedList;

public class EmpOps {
 LinkedList<Emp> lle=new LinkedList<>();
 
 public void addEmp(Emp emp)
 {
	 lle.add(emp);
 }
 public void deleteEmp(int empno)
 {  Iterator<Emp> it=lle.iterator();
	while(it.hasNext())
	{
		Emp p=it.next();
		if(p.getEmpNo()==empno)
			lle.remove(it.next());
 }
	}
 public void displayAllEmp()
 {for(Emp e:lle)
	 {
	 System.out.println(e);
	 }
 }
 
 public void incrSal()
 { for(Emp e:lle)
 {   double k=e.getSal()*1.1;
	 e.setSal(k);
 }
 }
 public void displayEmpDetails(int id)
 {
	 for(Emp e:lle)
	 {
		 if(e.getEmpNo()==id)
			 {System.out.println(e);
			 break;}
			 }
	 }
 public void displayEmpWithDesig(String desig) {
	 System.out.println("All the employees with desig "+desig+" are:");
	 for(Emp e:lle)
	 {
		 if((e.getDesig()).equals(desig)) {
			 System.out.println(e);
			 }
		 }
 }
 }
 
 
