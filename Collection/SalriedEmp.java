package Assday5;

public class SalriedEmp extends employee {
	private double basic_pay;

	public SalriedEmp(int id, String name, String mail, String dept, String desg, String doj, double basic_pay) {
		super(id, name, mail, dept, desg, doj);
		// TODO Auto-generated constructor stub
		this.basic_pay = basic_pay;
	}

	void calcsalry() {
		double total_pay = 1.3*basic_pay;
		System.out.println(super.getName() + "'s Salary : " + total_pay);
	}
}
