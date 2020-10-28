package com.abc.collections;

import java.util.HashMap;
import java.util.Map;

public class LoginAssign {
	private Map<String,String> users = new HashMap<>();
	
	public void addUser(String username,String password) {

		if (!(users.containsKey(username))) {
			System.out.println("User: "+username+ " created.");
			users.put(username, password);
		} else {
			System.out.println("Username "+username + " already taken.");
		}
	}
	
	public void loginUser (String username,String password) {
		
		if (users.get(username).equals(password)) {
			System.out.println("Logged In Successfully.");
		} else {
			System.out.println("Invalid username or password.");
		}		
	}
	
	public static void main(String[] args) {
		LoginAssign logins = new LoginAssign();
		
		logins.addUser("abc", "password1");
		logins.addUser("def", "password2");
		logins.addUser("ghi", "password3");
		logins.addUser("abc", "password");
		logins.addUser("fgh", "password");
		
		logins.loginUser("abc", "password1");
		logins.loginUser("abc", "password2");
	}
}
