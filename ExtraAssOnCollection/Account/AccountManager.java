package com.hsbc.collection_Assignment;

import java.util.Scanner;

public class AccountManager {

	public static void main(String[] args) {
		
		Account a = new Account(101,"Neel","Saving",23000,new Date(23,01,1998));
		Account b = new Account(102,"Neeraj","Current",25000,new Date(23,01,1999));
		Account c = new Account(103,"Nerav","Saving",23090,new Date(23,01,1997));
		
		AccountDao r = new AccountDao();
		
		//System.out.println("Enter your options ");
		
		r.addAccount(a);
		r.addAccount(b);
		r.addAccount(c);
		
		Scanner s = new Scanner(System.in);
		int flag =1;
		while(flag > 0 )
		{
		System.out.println("Enter your options ");
		System.out.println("Enter 1 for Adding new Account ");
		System.out.println("Enter 2 for closing Account ");
		System.out.println("Enter 3 for withdraw Account ");
		System.out.println("Enter 4 for Deposit Amount ");
		System.out.println("Enter 5 for checking balance ");
		System.out.println("Enter 6 for exit ");
		
		int n =s.nextInt();
		
		if(n == 1)
		{
			System.out.println("Enter Account id : ");
			int id = s.nextInt();
			System.out.println("Enter name of Account holder");
			String name = s.next();
			System.out.println("Enter Account type :");
			String type = s.next();
			System.out.println("Enter Account Balance : ");
			Double bal = s.nextDouble();
			System.out.println("Enter Date of Account opening :");
			int dd = s.nextInt();
			System.out.println("Enter Month of Account opening :");
			int mm = s.nextInt();
			System.out.println("Enter year of Account opening : ");
			int yyyy = s.nextInt();
			
			r.addAccount(new Account(id, name, type, bal, new Date(dd,mm,yyyy)));
		}
		else
		{
			if(n == 2)
			{
				System.out.println("Enter the account id which you want to delete : ");
				int id = s.nextInt();
				
				for(Account t : r.accountlist)
				{
					if(id == t.getId())
						r.closeAccount(t);
				}
				
			}
			
			if(n == 3 )
			{
				System.out.println("Enter the Account id from which amount is to be withdrawn : ");
				int id = s.nextInt();
				System.out.println("Enter the amount ");
				int amt = s.nextInt();
				
				for(Account t : r.accountlist)
				{
					if(id == t.getId())
						r.debitAccount(t, amt);
				}
				
			}
			
			if(n == 4 )
			{
				
				System.out.println("Enter the Account id for which deposit is made : ");
				int id = s.nextInt();
				System.out.println("Enter the amount ");
				int amt = s.nextInt();
				
				for(Account t : r.accountlist)
				{
					if(id == t.getId())
						r.creditAccount(t, amt);
				}
				
			}
			
			if(n == 5)
			{
				System.out.println("Enter the Account id for which you want to balance : ");
				int id = s.nextInt();
				System.out.println("Balance :" + r.showBalance(id));
				
			}
			
			if(n == 6 )
			{
				
				System.out.println("Thanks and have a wonderful day : ");
			}
			
			
				
	}
			System.out.println("If you wnat to continue press 1 else press 0");
			flag = s.nextInt();
			
		}
		s.close();
		//r.debitAccount(a, 3000);
		
	}
	
	
}
