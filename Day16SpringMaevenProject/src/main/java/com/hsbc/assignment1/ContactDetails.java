package com.hsbc.assignment1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ContactDetails {

	@Value("9876543212")
	String mobileNumber;

	@Value("amisha@hsbc.co.in")
	String emailId;

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "ContactDetails [mobileNumber=" + mobileNumber + ", emailId=" + emailId + "]";
	}



}