package com.hsbc.FileExample;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class WriteEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details : ");
		int empNo = sc.nextInt();
		String empName = sc.next();
		int empBasic = sc.nextInt();
		
		Employee emp = new Employee(empNo, empName, empBasic);
		
		int temp1 = emp.getEmpNo();
		String temp2 = emp.getEmpName();
		int temp3 = emp.getEmpBasic();
		System.out.println(temp1);
		char []buf = new char[100];
		
		for(int i = 0 ;i<3;i++){
			
		}
		try {
			FileOutputStream fw = new FileOutputStream("Employee.txt");
			fw.write('1');
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
