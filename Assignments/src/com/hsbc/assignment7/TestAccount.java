package com.hsbc.assignment7;

public class TestAccount {
	
	public static void main(String[] args)  {
		AccountDao dao=new AccountDao();
		
		dao.addAccount(new Account(7,"Saving"));
		dao.retrieveAllAccounts();
		dao.retrieveAllAccounts();
		dao.deleteAccount(3);
		dao.retrieveAllAccounts();
}
}