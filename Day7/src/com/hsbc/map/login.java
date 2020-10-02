package com.hsbc.map;

import java.util.HashMap;
import java.util.Map;


public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , String > map = new HashMap<>();
		
		map.put("book", "computer");
		map.put("sports", "voleeyball");
		map.put("name", "ujjwal");

		String username = "book";
		String password1 = "computer";
		String password2 = "check";

		int f= 0;

		for (Map.Entry<String,String> loop : map.entrySet()) {
			if(username.equals(loop.getKey()) && map.get(username).equals(password1)) {
				f=1;
				break;
			}
		}

		if (f == 1)
			System.out.println("Welcome user.");
		else
			System.out.println("Access Denined.");
		
	}

}
