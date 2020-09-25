package com.hsbc.practise;

public class Stu {
	private int stuNo;
	private String stuName;
	public Stu(int stuNo, String stuName) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
	}
	public Stu() {
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
}
