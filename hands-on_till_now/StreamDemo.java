package day6;

import java.io.FileInputStream;

public class StreamDemo {
	public static void main(String[] args) {
		byte[] barr =null;
		
		try {
			FileInputStream fis = new FileInputStream("input.txt");
			int size = fis.available();
			barr = new byte[size];
			fis.read(barr);
		}catch(Exception e) {}
		String barr_String = new String(barr);
		System.out.println(barr_String);
	}
}
