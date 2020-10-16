package com.hsbc.hw;

//	Author:Amisha
//	Date:23/09/2020
//	Purpose:Taking the input from the console, storing in a .dat file and extracts and display the record individually

import java.io.*;
import java.util.*;

public class EmpInformation {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your details => ");
		String details = br.readLine();

		FileWriter writer = new FileWriter("EmpRecord.dat");
		writer.write(details);
		writer.close();

		char[] carr = new char[100];
		FileReader reader = new FileReader("EmpRecord.dat");

		reader.read(carr);

		String newStr = new String(carr);
//		System.out.println(newStr);

		reader.close();
		
		StringTokenizer str = new StringTokenizer(newStr, ":");
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}

	}
}