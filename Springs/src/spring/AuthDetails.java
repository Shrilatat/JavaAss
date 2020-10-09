package spring;

public class AuthDetails {
String fname;
String lname;
int age;
String email;
int num;
String address;

public AuthDetails(String fname, String lname, int age, String email, int num, String address) {
	this.fname = fname;
	this.lname = lname;
	this.age = age;
	this.email = email;
	this.num = num;
	this.address = address;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
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
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "AuthDetails [fname=" + fname + ", lname=" + lname + ", age=" + age + ", email=" + email + ", num=" + num
			+ ", address=" + address + "]";
}

}
