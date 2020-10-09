package com.hsbc;

public class Emp1 {
private int empNO;
private String empName;
private double sal;
private String desig;

public Emp1() {
}

public Emp1(int empNO, String empName, int sal, String desig) {
	super();
	this.empNO = empNO;
	this.empName = empName;
	this.sal = sal;
	this.desig = desig;
}

public int getEmpNO() {
	return empNO;
}

public void setEmpNO(int empNO) {
	this.empNO = empNO;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public double getSal() {
	return sal;
}

public void setSal(double sal) {
	this.sal = sal;
}

public String getDesig() {
	return desig;
}

public void setDesig(String desig) {
	this.desig = desig;
}

@Override
public String toString() {
	return "Emp1 [empNO=" + empNO + ", empName=" + empName + ", sal=" + sal + ", desig=" + desig + "]";
}


}
