package com.Account;

public interface AccountDaoInf {

	void addAccount(Account a);
	void closeAccount(Account b);
	void debitAccount(Account a, int amount);
	void creditAccount(Account a, int amount);
	double showBalance(int id);
}
