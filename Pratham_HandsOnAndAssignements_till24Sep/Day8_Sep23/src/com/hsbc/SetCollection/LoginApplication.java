package com.hsbc.SetCollection;

import java.util.*;

public class LoginApplication {
	public static void main(String[] args) {
		Map<String, String> loginCredentials = new HashMap<>();
		
		loginCredentials.put("1234","ABCD");
		loginCredentials.put("5678","EFGH");
		loginCredentials.put("9101112","IJKL");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter username");
		String id = s.nextLine();
		System.out.println("Enter Password");
		String pass = s.nextLine();
		Set<String> keys = loginCredentials.keySet();
		
		int passFlag =1;
		int idFlag = 1;
		int loginFlag = 1;
		
		for(String key: keys) {
			if(id.equals(key)) {
				if(loginCredentials.get(key).equals(pass)) {
					System.out.println("User Logged IN");
					loginFlag =-1;
				}
				else {
					passFlag=-1;
				}
				}
			else {
					idFlag= -1;
			}
		}
	}
		
}
