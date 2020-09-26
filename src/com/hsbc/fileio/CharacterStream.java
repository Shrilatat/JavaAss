package com.hsbc.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("EmpNames.txt");
		writer.write("Hello World with IO");
		writer.write("\nRohan");
		
		writer.close();
		
		char[] carr = new char[80];
		
		FileReader fileReader = new FileReader("EmpNames.txt");
		fileReader.read(carr);
		
		String str = new String(carr);
		System.out.println(str);
	}
}
