package practice;

/*
 * creating a dao class AccountDao
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AccountDao {
	List list = new ArrayList();

	public AccountDao() {
		list.add(new SavingsAccount(1, "Saving", 800.0, 100.0));
		list.add(new SavingsAccount(2, "Saving", 900.0, 100.0));
		list.add(new CurrAccount(3, "Current", 1000.0, 80.0));
		list.add(new CurrAccount(4, "Current", 1100.0, 80.0));
	}

	public void retrieveAllAccounts() throws NoAccountFoundException {
		Iterator i1 = list.iterator();
		if (i1.hasNext() == false) {
			throw new NoAccountFoundException("Review Again");
		} else {
			while (i1.hasNext()) {
				System.out.println(i1.next());
			}
		}
	}

	public void addAccount(Account account) {
		int count = 0;
		Iterator i1 = list.iterator();
		while (i1.hasNext()) {
			Account a = (Account) i1.next();
			if (account.getAccId() == a.getAccId()) {
				count++;
			}
		}
		if (count == 0) {
			if (account.getAccName().equals("Saving")) {
				list.add(new SavingsAccount(account.getAccId(), account.getAccName(), 500.0, 100.0));
			} else if (account.getAccName().equals("Current")) {
				list.add(new CurrAccount(account.getAccId(), account.getAccName(), 500.0, 80.0));
			}
		}
	}

	public void deleteAccount(int acctId) throws NoAccountFoundException {
		Iterator i1 = list.iterator();
		if (i1.hasNext() == false) {
			throw new NoAccountFoundException("Review Again");
		}
		while (i1.hasNext()) {
			Account a = (Account) i1.next();
			if (a.getAccId() == acctId) {
				i1.remove();
			}
		}
	}
}
