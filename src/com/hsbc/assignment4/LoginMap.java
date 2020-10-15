package com.hsbc.assignment4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LoginMap {
	public static void main(String[] args) {

		Map<String, String> login = new HashMap<>();
		login.put("ABC", "admin");
		login.put("PQR", "password");

		String username, password;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Username and Password:");
		username = s.next();
		password = s.next();

		Set<String> key = login.keySet();
		boolean bool = false;

		if(!login.containsKey(username))
			System.out.println("User doesn't exist !!");
		else {
			for (String keys : key) {
				String user = keys;
				String pass = login.get(keys);

				if(user.equals(username) && pass.equals(password)) {
					bool = true;
					break;
				}
				else
					bool = false;
			}
			if(bool)
				System.out.println("Login Success !!");
			else
				System.out.println("Invalid Password");

		}
	}
}
