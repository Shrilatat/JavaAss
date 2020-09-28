package com.hsbc.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LoginApp {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("Amisha", "aaaaa");
		map.put("Aditi", "bbbbb");
		map.put("Parth", "ccccc");
		map.put("Abhinav", "ddddd");
		map.put("Mauli", "eeeee");

		String username = "Amisha";
		String password1 = "aaaaa";
		String password2 = "zzzzz";

		int flag = 0;

		Set<String> keys = map.keySet();
		for (String key : keys) {
			if (key.equals(username) == true && map.get(key).equals(password2) == true) {
				flag = 1;
				break;
			}
		}

		if (flag == 1)
			System.out.println("Welcome user.");
		else
			System.out.println("Access Denined.");

	}
}