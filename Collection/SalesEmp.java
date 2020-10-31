package Assday5;

public class SalesEmp extends employee {
	private double month_sale;

	public SalesEmp(int id, String name, String mail, String dept, String desg, String doj, double month_sale) {
		super(id, name, mail, dept, desg, doj);
		// TODO Auto-generated constructor stub
		this.month_sale = month_sale;
	}


	void calcsalry() {
		double total_pay = 0.1*month_sale;
		System.out.println(super.getName() + "'s Salary : " + total_pay);
	}
}
