package practice;
/*
 * 
 * model current account class that extends Account
 */
public class CurrAccount extends Account{
	private double bal;
	private double overdraftAmt;
	public CurrAccount(int accId,String accName,double bal, double overdraftAmt) {
		super(accId,accName);
		this.bal = bal;
		this.overdraftAmt = overdraftAmt;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public double getOverdraftAmt() {
		return overdraftAmt;
	}
	public void setOverdraftAmt(double overdraftAmt) {
		this.overdraftAmt = overdraftAmt;
	}
	@Override
	public String toString() {
		return "CurrAccount [AccId="+accId +", bal="+ bal + ", overdraftAmt=" + overdraftAmt + "]";
	}
	
	
	

}
