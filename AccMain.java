package practice;
/*
 * Service class AccMain to run operations
 */
public class AccMain {
public static void main(String[] args) throws NoAccountFoundException {
	AccountDao obj=new AccountDao();
	
	try {
	obj.retrieveAllAccounts();
	obj.deleteAccount(3);
	
	
}
	catch(NoAccountFoundException e) {
		System.out.println(e);
	}
	finally {
		obj.addAccount(new Account(4,"Saving"));
		obj.retrieveAllAccounts();
	}
}}
