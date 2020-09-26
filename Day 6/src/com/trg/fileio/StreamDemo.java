package com.trg.fileio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamDemo {
	
	public static void main(String[] args) {
		 
		char ch;
		int data;
		byte[] barr = new byte[80]; //Creating a byte array to store the data
 		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\nEW u\\Documents\\a.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			fis.read(barr);
			
			//while((ch = (char)fis.read()) != '\n' )
			//	System.out.println();
			
			
			
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		String str  = new String(barr);
		System.out.println(str);
	}

}
