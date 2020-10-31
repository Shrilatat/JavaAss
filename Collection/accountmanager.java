package Assday5;
import java.util.ArrayList;
import java.util.Scanner;
@SuppressWarnings("unused")
public class accountmanager {

	public static void main(String[] args) {
		
		account a1 = new account(1,"Aayush","Saving",10000.10,"10-10-10");
		account a2 = new account(2,"Aman","Saving",11000.11,"11-11-11");
		account a3 = new account(3,"kamal","Saving",12000.12,"12-12-12");
		accdao record = new accdao();
		record.addac(a1);
		record.addac(a2);
		record.addac(a3);
		
		Scanner s = new Scanner(System.in);
		int n = 1;
		while (n>0 && n<6) {
			System.out.println("Option 1 - Add Account");
			System.out.println("Option 2 - Rem Account");
			System.out.println("Option 3 - Withdraw");
			System.out.println("Option 4 - Deposite");
			System.out.println("Option 5 - Check balance");
			System.out.println("Option 6 - Exit");
			System.out.println("Enter Option Number");
			n = Integer.parseInt(s.next());
			if (n == 1) {
				System.out.println("Enter Name");
				String name = s.next();
				System.out.println("Enter Acc Type");
				String atype = s.next();
				System.out.println("Enter balance");
				int balance = Integer.parseInt(s.next());
				System.out.println("Enter Date of Opening");
				String doj = s.next();
				int id = record.id + 1;
				account temp = new account(id,name,atype,balance,doj);
				record.addac(temp);
				System.out.println(record.accountlist);
			}else if (n==2) {
				System.out.println("Enter Acc-id");
				int id = Integer.parseInt(s.next());
				for (account a : record.accountlist)
					if (a.getAcc_id() == id)
						record.closeacc(a);
			}else if (n==3) {
				System.out.println("Enter Acc-id");
				int id = Integer.parseInt(s.next());
				System.out.println("Enter Amount to withdraw");
				double amount = s.nextDouble();		
				for (account a : record.accountlist)
					if (a.getAcc_id() == id)
						record.withdraw(a, amount);		
			} else if (n==4) {
				System.out.println("Enter Acc-id");
				int id = Integer.parseInt(s.next());
				System.out.println("Enter Amount to Deposite");
				double amount = s.nextDouble();
				for (account a : record.accountlist)
					if (a.getAcc_id() == id)
						record.deposite(a, amount);
			}else if (n==5) {
				System.out.println("Enter Acc-id");
				int id = Integer.parseInt(s.next());
				record.checkbalance(id);
			}
		}	
		s.close();
	}	
}