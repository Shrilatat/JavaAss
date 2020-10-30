package demo.sts.day5;

import java.util.Date;

class SalariedEmployee extends Employee{

	private float basicPay;

	public SalariedEmployee(String name, String phNum, String emailId, String dept, String designation, Date doj,
			float basicPay) {
		super(name, phNum, emailId, dept, designation, doj);
		this.basicPay = basicPay;
	}

	@Override
	public float calcSalary() {
		return 1.3f*this.basicPay;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [basicPay=" + basicPay  + ", displayEmpDetails()="
				+ displayEmpDetails() + "]";
	}
	
	
}

class SalesEmployee extends Employee{

	private float monthlySales;

	
	public SalesEmployee(String name, String phNum, String emailId, String dept, String designation, Date doj,
			float monthlySales) {
		super(name, phNum, emailId, dept, designation, doj);
		this.monthlySales = monthlySales;
	}


	@Override
	public float calcSalary() {
		return 0.1f*monthlySales;
	}


	@Override
	public String toString() {
		return "SalesEmployee [monthlySales=" + monthlySales
				+ ", displayEmpDetails()=" + displayEmpDetails() + "]";
	}
	
	
}

class ContractEmployee extends Employee{

	private float rate;
	private int hoursWorked;
	
	public ContractEmployee(String name, String phNum, String emailId, String dept, String designation, Date doj,
			float rate, int hoursWorked) {
		super(name, phNum, emailId, dept, designation, doj);
		this.rate = rate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public float calcSalary() {
		return (float)hoursWorked*rate;
	}

	@Override
	public String toString() {
		return "ContractEmployee [rate=" + rate + ", hoursWorked=" + hoursWorked
				+ ", displayEmpDetails()=" + displayEmpDetails() + "]";
	}
	
	
	
}

public class TestEmployee {
	public static void main(String[] args) {
		Date now = new Date();
		Employee[] emps = {
				new SalariedEmployee("a", "b", "c", "c", "c", now, 2345.48f), 
				new SalesEmployee("a", "b", "c", "c", "c", now, 44.82f), 
				new ContractEmployee("a", "b", "c", "g", "c", now, 123.8f, 44), 
				new SalariedEmployee("a", "b", "f", "g", "c", now, 3234.8f), 
				new SalesEmployee("a", "gg", "c", "c", "c", now, 435.48f), 
				new ContractEmployee("a", "b", "c", "tt", "c", now, 54.43f, 70), 
				new SalariedEmployee("a", "b", "y", "c", "g", now, 4.54f), 
		};
		
		for(Employee emp : emps)
			System.out.println(emp);
	}
}
