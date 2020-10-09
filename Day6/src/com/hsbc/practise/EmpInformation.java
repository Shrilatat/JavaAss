package com.hsbc.practise;

import java.io.*;
import java.util.*;
public class EmpInformation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENter your details:");
		String details = br.readLine();
		
		FileWriter w = new FileWriter("Employ.txt");
		w.write(details);
		w.close();
		
		FileReader r = new FileReader("Employ.txt");
		char[] ar = new char[100];
		r.read(ar);
		
		String s = new String(ar);
		
		r.close();
		s.split(":");
		System.out.println(s);
	}

}
