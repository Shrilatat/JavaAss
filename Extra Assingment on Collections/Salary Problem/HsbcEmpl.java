
public class HsbcEmpl {
	private int id, phno;
	private String name, email, dept, desig, doj;
	public HsbcEmpl(int id, int phno, String name, String email, String dept, String desig, String doj) {
		super();
		this.id = id;
		this.phno = phno;
		this.name = name;
		this.email = email;
		this.dept = dept;
		this.desig = desig;
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "HsbcEmpl [id=" + id + ", phno=" + phno + ", name=" + name + ", email=" + email + ", dept=" + dept
				+ ", desig=" + desig + ", doj=" + doj + "]";
	}
	public void calculateSalary() {
		
	}
	public void getDetails() {
		
	}
	
}
