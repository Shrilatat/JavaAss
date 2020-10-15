package com.hsbc.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		char ch;
		byte[] barr = new byte[80];						  	//File size not exceeding 80 bytes
		try {
			FileInputStream fis = new FileInputStream("a.txt");
			int filesize = fis.available();					//Returns file size
			barr = new byte[filesize];			
			fis.read(barr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String str = new String(barr);
		System.out.println(str);
	}
}
