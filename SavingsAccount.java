package practice;
/*
 * creating a model Savings Account Class
 */
public class SavingsAccount extends Account{
private double bal;
private double minBal;

public SavingsAccount(int accId,String accName,double bal, double minBal) {
	super(accId,accName);
	this.bal = bal;
	this.minBal = minBal;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}
public double getMinBal() {
	return minBal;
}
public void setMinBal(double minBal) {
	this.minBal = minBal;
}
@Override
public String toString() {
	return "SavingsAccount [AccId="+accId+", bal=" + bal + ", minBal=" + minBal + "]";
}
}
