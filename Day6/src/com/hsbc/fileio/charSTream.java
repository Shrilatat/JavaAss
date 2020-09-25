package com.hsbc.fileio;
import java.io.*;
public class charSTream {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("Emp.txt");
		writer.write("Hello mauli, welcome to IO");
		writer.write("\nBye");
		writer.close();
		char[] ch = new char[100];
		FileReader reader = new FileReader("Emp.txt");
		reader.read(ch);
		String s = new String(ch);
		System.out.println(s);
	}
}
