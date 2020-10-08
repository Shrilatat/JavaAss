package com.hsbc.bean;

import java.util.Date;

public class User {
	String username, email;
	int age;
	Date date;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", age=" + age + ", date=" + date + "]";
	}

	
	
}
