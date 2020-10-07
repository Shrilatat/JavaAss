package com.trg.bookAuthor;

public class Author {
String fname;
String lname;
int age;
String email;
int no;
String address;
public Author(String fname, String lname, int age, String email, int no, String address) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.age = age;
	this.email = email;
	this.no = no;
	this.address = address;
}
@Override
public String toString() {
	return "[fname=" + fname + ", lname=" + lname + ", age=" + age + ", email=" + email + ", no=" + no
			+ ", address=" + address + "]";
}

}
