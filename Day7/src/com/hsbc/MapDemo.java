package com.hsbc;

import java.util.*;

class User {
	String userName, paassword;

	public User() {
		super();
	}

	public User(String userName, String paassword) {
		super();
		this.userName = userName;
		this.paassword = paassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPaassword() {
		return paassword;
	}

	public void setPaassword(String paassword) {
		this.paassword = paassword;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", paassword=" + paassword + "]";
	}
}

public class MapDemo {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("Sid", "123");
		map.put("Pln", "133");

		User user = new User("Sid", "123");
		User user1 = new User("Sis", "123");
		Set<String> name = map.keySet();

		for (String id : name) {
			if (user.userName == id && user.paassword == map.get(id)) {
				System.out.println("User is available");
			}
			// System.out.println(id +":"+map.get(id));
		}

	}
}