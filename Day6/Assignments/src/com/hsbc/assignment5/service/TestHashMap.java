package com.hsbc.assignment5.service;

import com.hsbc.assignment5.entity.Student;

public class TestHashMap {
	
	public static void main(String[] args) {
		Student st=new Student();
		
		st.setNames();
		st.printNames();
		st.getNames("1");
		st.printSize();
		st.remove("2");
		st.printNames();
		
	}
}
