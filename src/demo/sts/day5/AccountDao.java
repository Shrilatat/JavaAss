package demo.sts.day5;

import java.util.ArrayList;
import java.util.Iterator;


class InsufficiantFundsException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Insufficient Funds in Account!";
	}

}

class AccountNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Account not Found!";
	}

}

interface AccountDaoItf {
	public int addAccount(Account a);

	public int closeAccount(Account a);

	public boolean debitAccount(Account a, double amount) throws InsufficiantFundsException, AccountNotFoundException;

	public boolean creditAccount(Account a, double amount);

	public double showBalance(int accountId);

	public Account getAccountbyId(int accountId) throws AccountNotFoundException;
	
	public void displayAllAccounts();

}

public class AccountDao implements AccountDaoItf {
	private ArrayList<Account> accountList;

	public AccountDao() {
		super();
		this.accountList = new ArrayList<>();
	}

	@Override
	public int addAccount(Account a) {
		accountList.add(a);
		return 1;
	}

	@Override
	public int closeAccount(Account a) {
		if (accountList.remove(a))
			return 1;
		else
			return 0;
	}

	@Override
	public boolean debitAccount(Account a, double amount) throws InsufficiantFundsException, AccountNotFoundException {
		Account acc = this.getAccountbyId(a.getAccountId());
		acc.setBalance(acc.getBalance()+amount);
		if(acc.getBalance()>=0) return true;
		else return false;
		
	}

	@Override
	public boolean creditAccount(Account a, double amount) {
		try {
			Account acc = this.getAccountbyId(a.getAccountId());
			acc.setBalance(acc.getBalance() + amount);
			return true;
		} catch (AccountNotFoundException ae) {
			System.out.println(ae.getMessage());
		}
		return false;
	}

	@Override
	public double showBalance(int accountId) {
		try {
			return getAccountbyId(accountId).getBalance();
		} catch (AccountNotFoundException ae) {
			System.out.println(ae.getMessage());
		}
		return 0;
	}

	@Override
	public Account getAccountbyId(int accountId) throws AccountNotFoundException {
		Iterator<Account> it = accountList.iterator();
		while (it.hasNext()) {
			Account acc = it.next();
			if (acc.getAccountId() == accountId)
				return acc;
		}
		throw new AccountNotFoundException();
	}

	@Override
	public void displayAllAccounts() {
		for (Account acc : accountList)
			System.out.println(acc);
	}

}
