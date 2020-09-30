package com.hsbc.bean;


public class User {
	String username;
	int age;
	String mail;
	
	
	public int getAge() {
		return age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
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
		return "User [username=" + username + ", age=" + age + ", mail=" + mail + "]";
	}
	
	

}
