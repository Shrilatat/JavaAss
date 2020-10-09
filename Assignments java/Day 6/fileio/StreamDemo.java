package fileio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamDemo {
public static void main(String[] args) {
	//System.out.println("Enter your name ");
	char i;
	//byte[] barr=new byte[80];
	byte[] barr=null;
	try {
		FileInputStream fis=new FileInputStream("sample.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		/*
		 * while((i=(char)fis.read())!='\n') { System.out.println(i);} fis.close();
		 */
		int filesize=fis.available();
		barr=new byte[filesize];
		bis.read(barr);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String str=new String(barr);
	System.out.println(str);
}
}
