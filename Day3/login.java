package Day3Ass;

import java.util.HashMap;
import java.util.Scanner;

public class login {
	
	public static void main(String[] args) {
		HashMap<String, String> db = new HashMap<>();
		db.put("admin", "root");
		db.put("user", "toor");
		db.put("guest", "guest");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
	   	String uname=sc.next();
	   	System.out.println("Enter Password");
	   	String pass=sc.next();
	    sc.close();
	    
	    boolean flag = false;
	    
	    if (db.containsKey(uname) && (pass.equals(db.get(uname)))){
	    	flag = true;
	    }
	    
	    if (flag) {
    		System.out.println("User Authenticated");
    		System.out.println("Welcome  " + uname);
    	} else {
		    	System.out.println("Uname or pass invalid");
	    }
	}
}
