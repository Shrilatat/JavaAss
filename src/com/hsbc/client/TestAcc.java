package com.hsbc.client;

import com.hsbc.dao.Account;
import com.hsbc.dao.AccountDao;
import com.hsbc.exception.NoAccountFoundException;

public class TestAcc {

	
	public static void main(String[] args)  {
		AccountDao dao=new AccountDao();
		
		dao.addAccount(new Account(7,"Saving"));
		try {
			dao.retrieveAllAccounts();
		} catch (NoAccountFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
		dao.deleteAccount(3);
		
		
	}
		catch(NoAccountFoundException e) {
			System.out.println(e);
		}
	}
}

