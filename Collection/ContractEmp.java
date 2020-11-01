package Assday5;

public class ContractEmp extends employee {
	private double hours;
	private double rate;

	public ContractEmp(int id, String name, String mail, String dept, String desg, String doj, double hours, double rate) {
		super(id, name, mail, dept, desg, doj);
		// TODO Auto-generated constructor stub
		this.hours = hours;
		this.rate = rate;
	}


	void calcsalry() {
		double total_pay = hours*rate;
		System.out.println(super.getName() + "'s Salary : " + total_pay);
	}
}
