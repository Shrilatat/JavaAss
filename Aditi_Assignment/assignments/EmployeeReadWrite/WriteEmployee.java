package com.hsbc.assignments;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteEmployee {

	public static void main(String[] args)
	{
		int eid;
		String eName;
		int eBasic;
		Scanner sc=new Scanner(System.in);  //for taking user input
		System.out.println("ENTER EMPLOYEE ID");
		eid=sc.nextInt();
		System.out.println("ENTER EMPLOYEE NAME");
		eName=sc.next();
		System.out.println("ENTER BASIC");
		eBasic=sc.nextInt();
		Employee e=new Employee(eid,eName,eBasic);
		try {
			FileWriter writer=new FileWriter("emp.txt"); //for writing to file
			writer.write(e.getEmpNo()+"");
			writer.write(e.getEmpName());
			writer.write(e.getEmpBasic()+"");
			writer.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
