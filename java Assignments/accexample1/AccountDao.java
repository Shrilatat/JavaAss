package com.hsbc.accexample;

import java.util.ArrayList;
import java.util.List;

public class AccountDao {
	List<Account> accs=new ArrayList<Account>();
	
	public void setAccounts() {
		accs.add(new SavingAccount(1, "saving", 100, 500));
		accs.add(new SavingAccount(2, "saving", 100, 600));
		accs.add(new CurrentAccount(3, "current", 200, 700));
		accs.add(new CurrentAccount(4, "current", 200, 500));
	}
	
	public void retrieveAllAccount() {
		System.out.println(accs);
	}
	
	public void addAccount(Account account) {
		accs.add(account);
	}
	
	public void deleteAccount(int accid) {
		for(int i=0;i<accs.size();i++)
		{
			if(accs.get(i).getAccid()==accid)
				accs.remove(accs.get(i));
		}
	}
}
