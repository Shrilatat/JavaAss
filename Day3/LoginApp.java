package com.hsbc.Day3Ass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LoginApp {

	public static void main(String[] args) {

		Map<String, String> data = new HashMap<>();

		data.put("Username18", "pass@187");
		data.put("UsernameAB", "paSs*17");
		data.put("User97", "ps@123");
		data.put("UserBV", "passbv$1");
		data.put("UserName1", "spaa#1456");

		Set<String> users = data.keySet();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Username:");
		String username = sc.next();

		System.out.println("Enter Password:");
		String password = sc.next();
		
		String userPass = data.get(username);
		
		if (!users.contains(username)) {
			System.out.println("User not found");
		} 
		else if (userPass.equals(password)) {
			System.out.println("Incorrect Password");
		} 
		else {
			System.out.println("Login successfully!");
		}

	}
}
