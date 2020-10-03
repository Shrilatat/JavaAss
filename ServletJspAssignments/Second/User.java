package com.hsbc.bean;



public class User {
	
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
		return "User [username=" + username + ", age=" + age + "]";
	}

	

}
