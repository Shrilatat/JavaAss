package com.hsbc.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LoginApp {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("Vishnu", "Vishnu@123");
		map.put("Divya", "Divya@123");
		
		System.out.println(map);
		
		String testUsername = "Divya";
		String testPassword = "Divya@123";
		
		Set<String> list = map.keySet();
		
		for (String string : list) {
			if(string.equals(testUsername) && map.get(string).equals(testPassword)){
					System.out.println("Credentials correct");
					break;
				}
		}
	}
}
