package day6;

import java.io.FileReader;
import java.io.FileWriter;

public class StreamDemo2 {
	
	public static void main(String[] args) throws Exception {
		
	FileWriter writer = new  FileWriter("EmpName.txt");
	
	writer.write("Hello welcome\n");
	writer.write("Bharat");
	
	writer.close();
	
	char[] carr = new char[80];
	
	FileReader reader = new FileReader("EmpName.txt");
	
	reader.read(carr);
	
	System.out.println(new String(carr));
	}
}
