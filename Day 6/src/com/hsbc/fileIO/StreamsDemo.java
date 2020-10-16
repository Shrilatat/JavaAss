package com.hsbc.fileIO;

import java.io.*;

public class StreamsDemo {
	
	public static void main() {
		
		byte[] barr = null;
		
		try {
			FileInputStream fis = new FileInputStream("D:\\abcd.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			bis.read(barr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String str = new String(barr);
		System.out.println(str);
	}
}
