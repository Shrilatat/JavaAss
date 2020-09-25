package com.hsbc;

public class Person implements Comparable<Person>{
int pid;
String pnmae;
int age;
public Person() {
	
}
public Person(int pid, String pnmae,int age) {
	super();
	this.pid = pid;
	this.pnmae = pnmae;
	this.age=age;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPnmae() {
	return pnmae;
}
public void setPnmae(String pnmae) {
	this.pnmae = pnmae;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Person [pid=" + pid + ", pnmae=" + pnmae + ", age=" + age + "]";
}
@Override
public int compareTo(Person o) {
	/*
	 * // if(this.getPid()<o.getPid()) return -1;
	 * else if(this.getPid()>o.getPid()) return 1; else return 0;
	 */
	return this.getPnmae().compareTo(o.getPnmae());
}
}
