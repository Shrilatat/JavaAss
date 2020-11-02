package com.demo;
import java.util.*;
public class AccManager {
	public static void main(String[] args) {
		AccDao acc = new AccDao();
				
		System.out.println("1 : add new account");
		System.out.println("2 : close account");
		System.out.println("3 : withdraw amount");
		System.out.println("4 : deposit amount");
		System.out.println("5 : check balance");
		System.out.println("6 : exit");
		
		int ID = 100;
		
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your choice :");
			int n = sc.nextInt();
			
			if(n==1)
			{
				ID++;
				System.out.println("enter name of acc holder:");
				String name = sc.next();
				System.out.println("enter type of acc:");
				String type = sc.next();
				System.out.println("enter initial amount you want to deposit:");
				double bal = sc.nextDouble();
				System.out.println("enter date:");
				int d = sc.nextInt();
				System.out.println("enter month:");
				int m = sc.nextInt();
				System.out.println("enter year:");
				int y = sc.nextInt();
				acc.addAcc(new Account(ID,bal,name,type,new Date(d,m,y)));
			}
			else if(n==2)
			{
				System.out.println("enter acc id:");
				int id = sc.nextInt();
				ArrayList<Account> list = acc.getAccDB();
				for(Account a : list)
				{
					if(a.getId()==id)
						acc.closeAcc(a);
				}
				
			}
			else if(n==3)
			{
				System.out.println("enter acc id:");
				int id = sc.nextInt();
				System.out.println("enter amount:");
				double amt = sc.nextDouble();
				ArrayList<Account> list = acc.getAccDB();
				for(Account a : list)
				{
					if(a.getId()==id)
						acc.debitAcc(a, amt);
				}
			}
			else if(n==4)
			{
				System.out.println("enter acc id:");
				int id = sc.nextInt();
				System.out.println("enter amount:");
				double amt = sc.nextDouble();
				ArrayList<Account> list = acc.getAccDB();
				for(Account a : list)
				{
					if(a.getId()==id)
						acc.creditAcc(a, amt);
				}
			}
			else if(n==5)
			{
				System.out.println("enter acc id:");
				int id = sc.nextInt();
				acc.showBal(id);
			}
			else
			{
				System.out.println("thank you!");
				break;
			}
		}
	}
}
