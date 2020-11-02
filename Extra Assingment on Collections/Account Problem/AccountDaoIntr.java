package com.HSBCAccount;

public interface AccountDaoIntr {
	public void addAccount(Account a);
	public void closeAccount(Account a);
	public void debitAccount(Account a, double amount);
	public void creditAccount(Account a, double amt);
	public void showBalance(int accid);
}
