package com.hsbc;

public class DetailsBean {
	String username;
	String password;
	String email;
	String gender;
	int age;
	String address;
	int contnum;
	
	public DetailsBean() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContnum() {
		return contnum;
	}
	public void setContnum(int contnum) {
		this.contnum = contnum;
	}
	@Override
	public String toString() {
		return "DetailsBean [username=" + username + ", password=" + password + ", email=" + email + ", gender="
				+ gender + ", age=" + age + ", address=" + address + ", contnum=" + contnum + "]";
	}
	
}
