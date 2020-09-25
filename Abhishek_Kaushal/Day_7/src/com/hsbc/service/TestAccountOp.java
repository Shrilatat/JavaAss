package com.hsbc.service;

import com.hsbc.dao.AccountDao;
import com.hsbc.model.NoKeyFoundException;
import com.hsbc.model.SavingsAccount;

public class TestAccountOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDao dao = new AccountDao();
		//dao.populate();
		dao.retrieveAllAccounts();
		System.out.println();
		
		dao.addAccount(new SavingsAccount(5, "Abhi", 100.0f, 800.0f));
		dao.retrieveAllAccounts();
		System.out.println();
		
		try {
			dao.deleteAccount(2);
		} catch (NoKeyFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		dao.retrieveAllAccounts();
		System.out.println();

	}

}
