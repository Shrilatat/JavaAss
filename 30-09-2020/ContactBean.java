package com.trg.bean;

// Connect to Database and Store Contact info there

public class ContactBean {
	String firstName;
	String lastName;
	String email;
	String telephone;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "ContactBean [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", telephone="
				+ telephone + "]";
	}

}
