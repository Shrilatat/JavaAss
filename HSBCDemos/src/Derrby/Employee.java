package Derrby;

public class Employee {
	private int empId;
	private String empname;
	private int sal;
	public Employee() {	}
	public Employee(int empId, String empname, int sal) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.sal = sal;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String addEmp() {
		String sql = String.format("insert into emp values (%d , %s, %d)", this.getEmpId(),this.getEmpname(),this.getSal());
		return sql;
		
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", sal=" + sal + "]";
	}
	
	
	
}
