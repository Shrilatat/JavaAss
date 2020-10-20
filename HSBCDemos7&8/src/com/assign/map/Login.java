package com.assign.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Login {
	
	public static void main(String[] args) {
		Map<String , String> user = new HashMap<>();
		user.put("Ashish", "aaa");
		user.put("Anu", "bbb");
		user.put("Priya", "ccc");
		user.put("Geeta", "ddd");
		
		String username = "Ashish";
		String pass = "aaa";
		
		/*
		 * if(user.get(username) == pass) System.out.println("Authorized user"); else
		 * System.out.println("Unauthorized");
		 */
		int f=0;
		Set<String> keys = user.keySet();
		for(String key : keys)
		{
			String input = key;
			String pword = user.get(key);
			
			if((username.equals(input)) && (pass.equals(pword)))
			{
				System.out.println("Valid user");
				f=1;
			}
			if(f==1)
				break;
		}
		if(f!=1)
			System.out.println("Invalid user");
		
		
		
	}

}
