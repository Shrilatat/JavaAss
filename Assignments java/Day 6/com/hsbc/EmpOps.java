package com.hsbc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmpOps {
//Emp1 obj=new Emp1(1,"Ronak",20000,"Tse");
List<Emp1>lis=new LinkedList<>();

public void addEmp(Emp1 emp) {
	lis.add(emp);
}
public void deleteEmp(int empno) {
for(Iterator iterator=lis.iterator();iterator.hasNext();) {
	Emp1 emp=(Emp1) iterator.next();
	if(emp.getEmpNO()==empno)
		iterator.remove();
}
}
public void displayAllEmps() {
	for(Emp1 i:lis) {
		System.out.println(i);
	}
	System.out.println("_______________________________");
}
public void incrsal() {
	/*
	 * Iterator it =lis.iterator(); while(it.hasNext()) { double
	 * a=1.1*(int)it.next(); System.out.println("The incremented salaries are: "+a);
	 * }
	 */
	for(Iterator increase=lis.iterator();increase.hasNext();) {
		Emp1 as=(Emp1) increase.next();
		double a=as.getSal()*1.1;
		as.setSal(a);
		System.out.println(as);
	}System.out.println("_______________________________");
}
public void displayEmpDetails(int id) {
	for(Iterator iterator= lis.iterator();iterator.hasNext();) {
		Emp1 obj=(Emp1) iterator.next();
		if(obj.getEmpNO()==id) {
			System.out.println(obj);
		}
	}System.out.println("_______________________________");
}
public void displayEmpWithDesig(String Desig) {
	for(Iterator display=lis.iterator();display.hasNext();) {
		Emp1 emp=(Emp1) display.next();
		if(emp.getDesig().equals(Desig))
			System.out.println(emp);
	}
	
}
}
