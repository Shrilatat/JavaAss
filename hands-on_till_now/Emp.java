package day6;

public class Emp {
	private int empNo;
	private String  empName;
	private float sal;
	private String desig;
	
	
	public Emp(int empNo, String empName, float sal, String desig) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.sal = sal;
		this.desig = desig;
	}


	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empName=" + empName + ", sal=" + sal + ", desig=" + desig + "]";
	}


	public int getEmpNo() {
		return empNo;
	}


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public float getSal() {
		return sal;
	}


	public void setSal(float sal) {
		this.sal = sal;
	}


	public String getDesig() {
		return desig;
	}


	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	
}
