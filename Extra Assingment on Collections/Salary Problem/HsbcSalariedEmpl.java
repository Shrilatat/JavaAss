
public class HsbcSalariedEmpl extends HsbcEmpl{
	private double bsalary;

	public HsbcSalariedEmpl(int id, int phno, String name, String email, String dept, String desig, String doj,
			double bsalary) {
		super(id, phno, name, email, dept, desig, doj);
		this.bsalary = bsalary;
	}
	public void calculateSalary() {
		 double salary = bsalary+(0.1*bsalary)+(0.2*bsalary);
		 System.out.println(salary);
	}
	@Override
	public String toString() {
		return super.toString()+"HsbcSalariedEmpl [bsalary=" + bsalary + "]";
	}
	
}
