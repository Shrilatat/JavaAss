package com.hsbc.serialization;

public class Student implements java.io.Serializable {
	private int rollNo;
	private int stuAge;
	private String stuName;
	private transient String stuAddress;
	private transient int stuHeight;

	public Student(int rollNo, int stuAge, String stuName, String stuAddress, int stuHeight) {
		super();
		this.rollNo = rollNo;
		this.stuAge = stuAge;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
		this.stuHeight = stuHeight;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	public int getStuHeight() {
		return stuHeight;
	}

	public void setStuHeight(int stuHeight) {
		this.stuHeight = stuHeight;
	}
	
}
