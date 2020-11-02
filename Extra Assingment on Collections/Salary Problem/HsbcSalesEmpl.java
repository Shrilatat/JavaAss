
public class HsbcSalesEmpl extends HsbcEmpl{
	private int sales;

	public HsbcSalesEmpl(int id, int phno, String name, String email, String dept, String desig, String doj,
			int sales) {
		super(id, phno, name, email, dept, desig, doj);
		this.sales = sales;
	}
	public void calculateSalary() {
		double salary = 0.1*sales;
		System.out.println(salary);
	}
	@Override
	public String toString() {
		return super.toString()+ "HsbcSalesEmpl [sales=" + sales + "]";
	}
	
}
