package com.hsbc.practise;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class WriteStu {
	//public static PrintStream output;

	public static void main(String[] args) throws IOException {
		Stu s = new Stu();
		s.setStuName("Mauli");
		s.setStuNo(11);
		s.setStuName("Shivam");
		s.setStuNo(12);
		s.setStuName("SHinu");
		s.setStuNo(23);
		
		//System.out.println(s);
		FileWriter  w = new FileWriter("stu.txt");
		w.write(s.getStuName() + "  ");
		w.write(String.valueOf(s.getStuNo()));
		w.close();
		
		char[] arr = new char[100];
		FileReader reader = new FileReader("stu.txt");
		
		reader.read(arr);
		
		String str = new String(arr);
		System.out.println(str);
		
		reader.close();
	}
}
