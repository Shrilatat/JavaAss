package com.hsbc.collection_Assignment;

public interface AccountDaoIntf {

		void addAccount(Account a) ;
	
		void closeAccount(Account b);
	
		void debitAccount(Account a , int amount);
	
		void creditAccount(Account a , int amt);
	
		double showBalance(int id);
	
	
	
}
