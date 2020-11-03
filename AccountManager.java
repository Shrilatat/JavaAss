package com.Account;

import java.sql.Date;
import java.util.Scanner;



public class AccountManager {

	public static void main(String[] args) {
		Account a = new Account(101,"Tanu","Savings",75000,new Date(12,04,2000));
		Account b = new Account(102,"Utsav","Current",50000,new Date(11,04,1996));
		Account c = new Account(103,"Annu","Savings",62000,new Date(01,11,2001));
		Account d = new Account(104,"Ankit","Savings",45000,new Date(19,02,2010));

		AccountDao acc = new AccountDao();
		acc.addAccount(a);
		acc.addAccount(b);
		acc.addAccount(c);
		acc.addAccount(d);
		
		Scanner s = new Scanner(System.in);
		int flag = 1;
		while(flag > 0) {
			System.out.println("Option 1 : Adding new Account ");
			System.out.println("Option 2 : Closing Account ");
			System.out.println("Option 3 : Withdraw Amount ");
			System.out.println("Option 4 : Deposit Amount ");
			System.out.println("Option 5 : Check balance ");
			System.out.println("Option 6 : Exit ");
			
			System.out.println("\nEnter your option : ");
			
			int n = s.nextInt();
			
			if(n == 1) {
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

				acc.addAccount(new Account(id, name, type, bal, new Date(dd,mm,yyyy)));
			}
			
			else if(n == 2) {
				System.out.println("Enter the account id which you want to delete : ");
				int id = s.nextInt();

				for(Account t : acc.accList)
				{
					System.out.println(t.getId());
					if(id == t.getId()) {
						t.showAccountDetails();
					    acc.closeAccount(t);
					    break;
					}
				}
			}
			
			else if(n == 3) {
				System.out.println("Enter the Account id from which amount is to be withdrawn : ");
				int id = s.nextInt();
				System.out.println("Enter the amount ");
				int amt = s.nextInt();

				for(Account t : acc.accList)
				{
					if(id == t.getId())
						acc.debitAccount(t, amt);
				}
			}
			
			else if(n == 4) {
				System.out.println("Enter the Account id for which deposit is made : ");
				int id = s.nextInt();
				System.out.println("Enter the amount ");
				int amt = s.nextInt();

				for(Account t : acc.accList)
				{
					if(id == t.getId())
						acc.creditAccount(t, amt);
				}
			}
			
			else if(n == 5) {
				System.out.println("Enter the Account id for which you want to balance : ");
				int id = s.nextInt();
				System.out.println("Balance :" + acc.showBalance(id));
			}
			
			else {
				System.out.println("Thanks and have a wonderful day!!!");
				flag = 0;
			}
			if(n != 6) {
			    System.out.println("If you want to continue, Press 1 ..... else Press 0");
			    flag = s.nextInt();
			}
		}
		
		s.close();
	}

}
