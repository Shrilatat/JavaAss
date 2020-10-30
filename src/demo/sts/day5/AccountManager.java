package demo.sts.day5;

import java.util.*;

public class AccountManager {
	private static String genRandomString() {
		int leftLimit = 48; // numeral '0'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 5;
		return new Random().ints(leftLimit, rightLimit + 1).filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
				.limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}

	public static void main(String[] args) {
		AccountDao accounts = new AccountDao();
		String com = "";
		Scanner out = new Scanner(System.in);
		while (!com.equals("exit")) {
			System.out.println("Add Accout(add) | Close Account (close) | Withdraw Amount (withdrow)"
					+ "	| Deposit Amount (deposit) | Check Balance (check) | Exit (exit)");
			try {
				com = out.next();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				break;
			}
			switch (com) {
			case "all": {
				accounts.displayAllAccounts();
				break;
			}
			case "add": {
				accounts.addAccount(new Account(genRandomString(), genRandomString(), 44445, new Date()));
				break;
			}
			case "close": {
				int acId;
				try {
					System.out.println("Enter Account id: ");
					acId = out.nextInt();
					accounts.closeAccount(accounts.getAccountbyId(acId));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case "withdraw": {
				int acId;
				double amount;
				try {
					System.out.println("Enter Account id: ");
					acId = out.nextInt();
					System.out.println("Enter Amount: ");
					amount = out.nextDouble();
					accounts.debitAccount(accounts.getAccountbyId(acId), amount);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case "deposit": {
				int acId;
				double amount;
				try {
					System.out.println("Enter Account id: ");
					acId = out.nextInt();
					System.out.println("Enter Amount: ");
					amount = out.nextDouble();
					accounts.creditAccount(accounts.getAccountbyId(acId), amount);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			}
			case "check": {
				int acId;
				try {
					System.out.println("Enter Account id: ");
					acId = out.nextInt();
					System.out.println("Account Balance = " + accounts.getAccountbyId(acId).getBalance());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			default:
				System.out.println("Unexpected expression: " + com);
			}
		}
		out.close();
	}
}
