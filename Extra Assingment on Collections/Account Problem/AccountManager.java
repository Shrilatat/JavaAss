package com.HSBCAccount;


import java.util.Scanner;


public class AccountManager {
	
	
	
	public static void main(String[] args) {
		Account a1 = new Account(2,"Suresh", "Current", 40000.25,"25/12/2020");
		Account a2 = new Account(2,"Suresh", "Current", 40000.25,"25/12/2020");
		Account a3 = new Account(3,"Kamlesh", "Savings", 30000.25,"25/12/2020");
		Account a4 = new Account(4,"Nolesh", "Savings", 20000.25,"25/12/2020");
		Account a5 = new Account(1,"Welesh", "Savings", 10000.25,"25/12/2020");
		AccountDao ad = new AccountDao();
		int input=1;
		//AccountManager am = new AccountManager();
		while(input!=0) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input");
		input = sc.nextInt();
		switch(input) {
		case 1:
			ad.addAccount(a1);
			break;
		case 2:
			ad.closeAccount(a2);
			break;
		case 3:
			System.out.println("Enter your amount");
			double amount = sc.nextDouble();
			ad.debitAccount(a1, amount);
			break;
		case 4:
			System.out.println("Enter your amount");
			double amt = sc.nextDouble();
			ad.debitAccount(a1, amt);
			break;
		case 5:
			System.out.println("Enter customer id");
			int cusid = sc.nextInt();
			ad.showBalance(cusid);
			break;
		}
		}
	}
	
}
