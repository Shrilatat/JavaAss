package com.hsbc.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamDemo {
	public static void main(String[] args) {
		
		byte []barr=null;
		try {
			InputStream fis = new FileInputStream("");
			int filesize = fis.available();
			barr= new byte[filesize];
			fis.read(barr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str = new String(barr);
		System.out.println(str);
	}
}
