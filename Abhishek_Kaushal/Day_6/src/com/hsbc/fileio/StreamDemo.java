package com.hsbc.fileio;

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
			writer.write("Hello, Welcome to I/O ");
			writer.write("Abhishek");
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
		
		
		
		
		
		
//		byte[] arr = null;
//		try {
//			FileInputStream fis = new FileInputStream("C:\\Users\\asus\\Documents\\input.txt");
//			BufferedInputStream bis = new BufferedInputStream(fis);
//			
//			int filesize = fis.available();
//			arr = new byte[filesize];
//			bis.read(arr);
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String str = new String(arr);
//		System.out.println(str);
	}

}
