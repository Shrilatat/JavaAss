package com.trg.rest.person;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
	String pname;
	int age;

	public Person(String pname, int age) {
		super();
		this.pname = pname;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [pname=" + pname + ", age=" + age + "]";
	}

}
