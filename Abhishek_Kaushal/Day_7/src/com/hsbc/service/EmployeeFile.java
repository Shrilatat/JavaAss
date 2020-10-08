package com.hsbc.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.Employee;

public class EmployeeFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		try {
			FileReader fr = new FileReader("EmpRec.dat");
			BufferedReader br = new BufferedReader(fr);
			//StringBuffer sb = new StringBuffer();
			String line;
			while((line=br.readLine())!=null)
			{
				String[] arr = line.split(":");
				list.add(new Employee(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2])));
			}
			Employee[] earr = new Employee[list.size()];
			list.toArray(earr);
			for(Employee emp: earr)
			{
				System.out.println(emp);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
