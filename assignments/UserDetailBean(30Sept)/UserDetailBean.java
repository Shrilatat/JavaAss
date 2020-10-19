package com.hsbc.bean;

/**
 * bean class that has properties and states for a user.
 * @author ADITI GUPTA
 *
 */
public class UserDetailBean {

	
	String name,pass,email,gender,address;
	int age,contact;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public UserDetailBean() {
		super();
		
	}
	@Override
	public String toString() {
		return "UserDetailBean [name=" + name + ", pass=" + pass + ", email=" + email + ", gender=" + gender
				+ ", address=" + address + ", age=" + age + ", contact=" + contact + "]";
	}
	
	
	
}
