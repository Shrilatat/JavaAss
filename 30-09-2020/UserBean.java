package com.trg.bean;

public class UserBean {
	String username;
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "UserBean [username=" + username + ", age=" + age + "]";
	}
}
