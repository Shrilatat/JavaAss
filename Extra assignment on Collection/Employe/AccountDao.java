package com.hsbc.AssignCollect;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AccountDao extends AccManager implements AccDaoIntf {

	private ArrayList<Account> acclist = new ArrayList<>();

	public void addAcc(Account a) {

		acclist.add(a);
	}

	public void closeAcc(Account a) {

		acclist.remove(a);
	}

	public void debitAcc(Account a, double amt) {

		double currBal = a.getBal();
		double updBal = currBal - amt;
		if (updBal < 5000.00) {
			
			System.out.println("Transaction cannot be done");
              
		}
		else
			a.setBal(updBal);
	}

	public void creditAcc(Account a, double amt) {
		
		a.setBal((a.getBal()+amt));

	}

	public void showBal(int accId) {
		
		for(Account b : acclist)
		{
			if(b.getAccId()==accId)
				{
				  System.out.println(b.getBal());
				  break ;
				}
		}

	}

	public ArrayList<Account> getAcclist() {
		return acclist;
	}

	public void setAcclist(ArrayList<Account> acclist) {
		this.acclist = acclist;
	}
	
	

}
