package com.hsbc.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StramDemo {
	
	public static void main(String[] args) {

		char ch;

		try {
			FileInputStream fis = new FileInputStream("D:\\abcd.txt");

			while ((ch = (char) fis.read()) != '\n')
				System.out.print(ch);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
