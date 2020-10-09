package com.hsbc.fileio;
import java.io.*;
public class StreamDemo {
	public static void main(String[] args) {
		//System.out.println("Enter ur name:");
		byte[] barr = new byte[100];
		try {
			FileInputStream fis  =  new FileInputStream("E:\\input.txt");
			fis.read(barr);
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		String s = new String(barr);
		System.out.println(s);
	}
}
