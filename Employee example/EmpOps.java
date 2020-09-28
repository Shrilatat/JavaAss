package com.hsbc.collects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpOps {
	private List<Emp> emps = new ArrayList<Emp>();

	public void addEmp(Emp emp) {
		emps.add(emp);
		System.out.println(emps);
	}

	public void deleteEmp(int empno) {
		for (Iterator<Emp> iterator = emps.iterator(); iterator.hasNext();) {
			Emp e = iterator.next();
			if (e.getEmpNo() == empno) {
				iterator.remove();
			}
		}
		System.out.println(emps);
	}

	public void displayAllEmps() {
		for (Emp e : emps) {
			System.out.println(e);
		}
	}

	public void incrSal() {
		for (Emp e : emps) {
			int temp = e.getSal();
			temp = (int) (temp + (0.1 * temp));
			e.setSal(temp);
		}
		System.out.println(emps);
	}

	public void displayEmpDetails(int id) {
		for (Emp e : emps) {
			if (e.getEmpNo() == id)
				System.out.println(e);
		}
	}

	public void displayEmpWithDesig(String desig) {
		for (Emp e : emps) {
			if (e.getDesign() == desig)
				System.out.println(e);
		}
	}
}
