package com.hsbc.modelacc;
/**
* Service class to access dao
*
/
public class TestAcc {

	
	public static void main(String[] args) throws NoAccountFoundException {
		AccountDao dao=new AccountDao();
		
		dao.addAccount(new Account(7,"Saving"));
		dao.retrieveAllAccounts();
		
		try {
		dao.retrieveAllAccounts();
		dao.deleteAccount(3);
		
		
	}
		catch(NoAccountFoundException e) {
			System.out.println(e);
		}
	}
}

