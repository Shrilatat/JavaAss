package com.hsbc.assignment;

import java.util.HashMap;
import java.util.Map;

public class LoginApp {
	
		private Map<String, String> cred = new HashMap<>();
		
		public LoginApp() {}

		
		public void populate() {
			cred.put("Abhishek", "Kaushal");
			cred.put("Kaushal","Abhishek");
			cred.put("Abhinav", "Srivastava");
			cred.put("Srivastava","Abhinav");
		}
		
		public void validate(String username, String password)
		{
			if(!cred.containsKey(username))
			{
				System.out.println("Invalid username");
			}
			else if(cred.get(username).equals(password))
			{
				System.out.println("Login successful");
			}
			else
			{
				System.out.println("Invalid credentials");
			}
		}

		public Map<String, String> getCred() {
			return cred;
		}

		public void setCred(Map<String, String> cred) {
			this.cred = cred;
		}

		
		
	

}
