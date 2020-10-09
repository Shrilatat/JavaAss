package fileio;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class StreamDemo2 {
public static void main(String[] args)throws IOException {
	FileWriter writer=new FileWriter("New.txt");
	writer.write("Hello welcome to io ");
	writer.write("Bhavya");
	writer.close();
	
	char[] carr=new char[80];
	
	FileReader reader =new FileReader("New.txt");
	reader.read(carr);
	String str=new String(carr);
	System.out.println(str);
	reader.close();
}
}
