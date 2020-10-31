package Day4;

public class Employee {
	private double salary;
	private String name, dept, subject;
	
	public Employee(double salary, String name, String dept, String subject) {
		super();
		this.salary = salary;
		this.name = name;
		this.dept = dept;
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee [ name=" + name + ", dept=" + dept + ", salary=" + salary + ", subject=" + subject + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


}
