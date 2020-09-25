package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.Account;
import com.hsbc.model.CurrAccount;
import com.hsbc.model.NoKeyFoundException;
import com.hsbc.model.SavingsAccount;

public class AccountDao {
	
	List<Account> list= null;
	
	
	
	public AccountDao() {
		super();
		list = new ArrayList<>();
		
		Account sa1 = new SavingsAccount(1, "bbb", 1000.0f, 5000.0f);
		Account sa2 = new SavingsAccount(2, "ccc", 500.0f, 2000.0f);
		
		Account ca1 = new CurrAccount(3, "bbb", 5000.0f);
		Account ca2 = new CurrAccount(4, "ccc",  2000.0f);
		
		
		list.add(sa1);
		list.add(sa2);
		list.add(ca1);
		list.add(ca2);
	}

//	public void populate()
//	{
//		Account sa1 = new SavingsAccount(1, "bbb", 1000.0f, 5000.0f);
//		Account sa2 = new SavingsAccount(2, "ccc", 500.0f, 2000.0f);
//		
//		Account ca1 = new CurrAccount(3, "bbb", 5000.0f);
//		Account ca2 = new CurrAccount(4, "ccc",  2000.0f);
//		
//		
//		list.add(sa1);
//		list.add(sa2);
//		list.add(ca1);
//		list.add(ca2);
//	}
	
	public void retrieveAllAccounts()
	{
		System.out.println(list);
	}
	
	public void addAccount(Account account)
	{
		list.add(account);
	}

	public void deleteAccount(int accId) throws NoKeyFoundException
	{
		for(Account a : list)
		{
			if(a.getAccId() == accId)
			{
				list.remove(a);
				return;
			}
		}
		throw new NoKeyFoundException("No such accId");
	}
	@Override
	public String toString() {
		return "AccountDao [list=" + list + "]";
	}

}
