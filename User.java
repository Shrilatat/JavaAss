package com.hsbc;

public class User {
String firstName;
String lastName;
String city;
String email;
public User(String firstName, String lastName, String city, String email) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.city = city;
	this.email = email;
}
public User() {
	// TODO Auto-generated constructor stub
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "User [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", email=" + email + "]";
}


}
