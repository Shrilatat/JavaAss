package com.hsbc.Tasks;

//Author : Amisha
//Date : 24/09/2020
//Purpose : subclass of Account of current type

public class CurrentAccount extends Account {

	private double bal;
	private double overdraftBal;

	public CurrentAccount() {
	}

	public CurrentAccount(int accId, String acctName, double bal, double overdraftBal) {
		super(accId, acctName);
		this.bal = bal;
		this.overdraftBal = overdraftBal;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public double getOverdraftBal() {
		return overdraftBal;
	}

	public void setOverdraftBal(double overdraftBal) {
		this.overdraftBal = overdraftBal;
	}

	@Override
	public String toString() {
		return "Account type => CurrentAccount [accId=" + super.getAccId() + ", acctName=" + super.getAcctName() + ", bal=" + bal
				+ ", overdraftBal=" + overdraftBal + "]";
	}

}
