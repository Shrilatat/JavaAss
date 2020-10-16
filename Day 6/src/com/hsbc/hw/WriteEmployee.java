package com.hsbc.hw;

//Author:Amisha
//Date:23/09/2020
//Purpose:To write into file and extract it.

import java.io.*;

public class WriteEmployee {

	public static void main(String[] args) throws IOException {

		Employee emp = new Employee();

		emp.setEmpNo(111);
		emp.setEmpName("Amisha");
		emp.setEmpBasic(50000);

//		System.out.println(emp.getEmpNo());
//		System.out.println(emp.getEmpName());
//		System.out.println(emp.getEmpBasic());

		FileWriter writer = new FileWriter("emp.txt");
		writer.write(String.valueOf(emp.getEmpNo()) + " ");
//		writer.write(emp.getEmpName() + " ");
//		writer.write(String.valueOf(emp.getEmpBasic()));

		writer.close();

		char[] carr = new char[100];
		FileReader reader = new FileReader("emp.txt");

		reader.read(carr);

		String str = new String(carr);
		System.out.println(str);

		reader.close();

	}

}
