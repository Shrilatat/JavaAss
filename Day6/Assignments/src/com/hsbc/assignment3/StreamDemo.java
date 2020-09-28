package com.hsbc.assignment3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("EmpNames.txt");
			writer.write("Hello");
			writer.write("Siddhant");
			writer.close();
			
			
			char[] carr =new char[80];
			FileReader reader =new FileReader("EmpNames.txt");
			reader.read(carr);
			String str = new String(carr);
			System.out.println(str);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
