package com.hsbc.Tasks;

//Author : Amisha
//Date : 24/09/2020
//Purpose : subclass of Account of savings type

public class SavingsAccount extends Account {

	private double bal;
	private double minBalance;

	public SavingsAccount() {
	}

	public SavingsAccount(int accId, String acctName, double bal, double minBalance) {
		super(accId, acctName);
		this.bal = bal;
		this.minBalance = minBalance;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	@Override
	public String toString() {
		return "Account type => SavingsAccount [accId=" + super.getAccId() + ", acctName=" + super.getAcctName() + ", bal=" + bal
				+ ", minBalance=" + minBalance + "]";
	}

}
