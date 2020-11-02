
public class HsbcContractEmpl extends HsbcEmpl{
	private int hrs;
	private double rateperhour;
	public HsbcContractEmpl(int id, int phno, String name, String email, String dept, String desig, String doj, int hrs,
			double rateperhour) {
		super(id, phno, name, email, dept, desig, doj);
		this.hrs = hrs;
		this.rateperhour = rateperhour;
	}
	public void calculateSalary() {
		double salary = hrs*rateperhour;
		System.out.println(salary);
	}
	@Override
	public String toString() {
		return super.toString()+"HsbcContractEmpl [hrs=" + hrs + ", rateperhour=" + rateperhour + "]";
	}
	
}
