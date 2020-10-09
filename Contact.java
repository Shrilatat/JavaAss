package com.hsbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Contact {
	
	@Value("989898")
	String phone;
	
	@Value("mn@kl.com")
	String email;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [phone=" + phone + ", email=" + email + "]";
	}
	
	
	

}
