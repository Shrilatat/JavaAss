package practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmpOps {
List<Emp> l1=new LinkedList<Emp>();

public void addEmp(Emp emp) {
	l1.add(emp);
}
public void deleteEmp(int empno) {
	Iterator<Emp> i1=l1.iterator();
	while(i1.hasNext()) {
		Emp e=i1.next();
		if(e.getEmpNo()==empno)
			i1.remove();
	}
}
public void displayAllEmps() {
	Iterator<Emp> i1=l1.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
}
public void incrSal() {
	Iterator<Emp> i1=l1.iterator();
	while(i1.hasNext()) {
		Emp p=i1.next();
		double temporary=(p.getSal()+p.getSal()*0.10);
		p.setSal(temporary);
	}	
}
public void displayEmpDetails(int id) {
	Iterator<Emp> i1=l1.iterator();
	while(i1.hasNext()) {
		Emp e=i1.next();
		if(e.getEmpNo()==id)
			System.out.println(e);
	}
}


}
