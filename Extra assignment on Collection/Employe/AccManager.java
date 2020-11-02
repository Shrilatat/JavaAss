package com.hsbc.AssignCollect;

import java.util.Date;
import java.util.Scanner;

public class AccManager {
	
	public static void main(String[] args) {
		
		
		
		Account e = new Account(1,"a1","Saving",6000,new Date(1999,05,15));
		Account b = new Account(2,"a2","Saving",8000,new Date(2005,01,12));
		Account c = new Account(3,"a3","Saving",9000,new Date(2009,07,21));
		
		AccountDao Acc = new AccountDao();
		
		Acc.addAcc(e);
		Acc.addAcc(b);
		Acc.addAcc(c);
        Scanner sc =  new Scanner(System.in);
		
        boolean x = true ;
        while(x)
        {
        	System.out.println("1. Add new account");
    		System.out.println("2. Close account");
    		System.out.println("3. Withdraw amount");
    		System.out.println("4. Deposit amount");
    		System.out.println("5. Check balance");
    		System.out.println("6. Exit");
    		
        	System.out.println("Select any one of the options above");
        	int n = sc.nextInt();
        	
        	if(n==1)
        	{
        		System.out.println("Enter Account id : ");
    			int id = sc.nextInt();
    			System.out.println("Enter name of Account holder");
    			String name = sc.next();
    			System.out.println("Enter Account type :");
    			String type = sc.next();
    			System.out.println("Enter Account Balance : ");
    			Double bal = sc.nextDouble();
    			System.out.println("Enter year, month and date of account opening respectively :");
    			int y = sc.nextInt();
    			int m = sc.nextInt();
    			int d = sc.nextInt();
    			
				Account a = new Account(id,name, type, bal, new Date(y,m,d));
				Acc.addAcc(a);
				
				System.out.println("if you want to continue enter 1 else enter 0");
				int p = sc.nextInt();
				if(p==0)
				{
					x=false;
				}
				
        	}
        	
        	else if(n==2)
        	{
        		System.out.println("Enter id of account to be closed");
        		int id = sc.nextInt();
        		for(Account a : Acc.getAcclist())
        		{
        			if(a.getAccId() == id)
        			{
        				Acc.closeAcc(a);
        				break;
        			}
        		}
        		System.out.println("if you want to continue enter 1 else enter 0");
				int p = sc.nextInt();
				if(p==0)
				{
					x=false;
				}
        	}
        	
        	else if(n==3)
        	{
        		System.out.println("Enter id of account and amount to be withdrawn");
        		int id = sc.nextInt();
        		double amt = sc.nextDouble();
        		for(Account a : Acc.getAcclist())
        		{
        			if(a.getAccId() == id)
        			{
        				Acc.debitAcc(a, amt);
        				break;
        			}
        		}
        		System.out.println("if you want to continue enter 1 else enter 0");
				int p = sc.nextInt();
				if(p==0)
				{
					x=false;
				}
        		
        	}
        	
        	else if(n==4)
        	{
        		System.out.println("Enter id of account and amount to be deposited");
        		int id = sc.nextInt();
        		double amt = sc.nextDouble();
        		for(Account a : Acc.getAcclist())
        		{
        			if(a.getAccId() == id)
        			{
        				Acc.creditAcc(a, amt);
        				break;
        			}
        		}
        		System.out.println("if you want to continue enter 1 else enter 0");
				int p = sc.nextInt();
				if(p==0)
				{
					x=false;
				}
        	}
        	
        	else if(n==5)
        	{
        		System.out.println("Enter id of account for which balance to be showed");
        		int id = sc.nextInt();
        		Acc.showBal(id);
        		System.out.println("if you want to continue enter 1 else enter 0");
				int p = sc.nextInt();
				if(p==0)
				{
					x=false;
				}
        	}
        	else if(n==6)
        	{
        		System.out.println("Exited");
        		x=false ;
        		System.out.println("if you want to continue enter 1 else enter 0");
				int p = sc.nextInt();
				if(p==0)
				{
					x=false;
				}
        	}
        	else 
        	{
        		System.out.println("Invalid option chosen try again!!");
        		System.out.println("if you want to continue enter 1 else enter 0");
				int p = sc.nextInt();
				if(p==0)
				{
					x=false;
				}
        	}
        }
	}
	
}
