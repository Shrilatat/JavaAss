package com.hsbc.accexample;

public class TestAccount {
	public static void main(String[] args) {
		AccountDao Dao=new AccountDao();
		
		Dao.setAccounts();
		
		Dao.retrieveAllAccount();
		
		Dao.addAccount(new SavingAccount(5, "saving", 100, 200));
		
		Dao.deleteAccount(3);
		Dao.retrieveAllAccount();
	}

}
