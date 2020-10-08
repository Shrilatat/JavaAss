package com.hsbc.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

import com.hsbc.model.Employee;

public class WriteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee number: ");
		int empNo = sc.nextInt();
		System.out.println("Enter Employee name: ");
		String empName= sc.next();
		System.out.println("Enter Employee basic: ");
		int empBasic= sc.nextInt();
		
		Employee employee = new Employee(empNo, empName, empBasic);
		
		try {
			FileWriter writer = new FileWriter("emp.txt");
			writer.write(employee.getEmpNo()+" ");
			writer.write(employee.getEmpName()+" ");
			writer.write(employee.getEmpBasic()+" ");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//char[] carr =new carr[];
		try {
			FileReader reader =new FileReader("emp.txt");
			BufferedReader br = new BufferedReader(reader);
			StringBuffer sb = new StringBuffer();
			String line;
			while( (line=br.readLine()) != null)
			{
				sb.append(line);
				sb.append("\n");
			}
			br.close();
			reader.close();
			System.out.println(sb.toString());
			//System.out.println(Arrays.asList(cb));
			
//			String str = new String(Files.readAllBytes(Paths.get("emp.txt")));
//			System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
