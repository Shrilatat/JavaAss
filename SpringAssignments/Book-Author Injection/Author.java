package com.trg;

public class Author {
	private String firstName;
	private int age;
	private String email;
	private long contact;
	
	


	public Author(String firstName, int age, String email, long contact) {
		super();
		this.firstName = firstName;
		this.age = age;
		this.email = email;
		this.contact = contact;
	}




	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", age=" + age + ", email=" + email + ", contact=" + contact + "]";
	}
	
	
	

}
