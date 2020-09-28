package com.hsbc.fileIO;

import java.io.*;

public class StreamDemo {
	public static void main(String[] args) throws IOException {

		FileWriter writer = new FileWriter("EmpNames.txt");
		writer.write("Hello. Welcome to IO");
		writer.write("Amisha.");

		writer.close();

		char[] carr = new char[80];
		FileReader reader = new FileReader("EmpNames.txt");

		reader.read(carr);

		String str = new String(carr);
		System.out.println(str);

		reader.close();
	}

}
