import java.util.Scanner;
public class Website {
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter no. of websites");
	String no = s.next();
	
	int n= Integer.parseInt(no);
	
	String[] sites = new String[n];
	
	System.out.println("Enter name of websites");
	
	for(int i=0;i<n;i++)
	{
		sites[i] = s.next();
	}
	
	int total=0;
	for(int i=0;i<n;i++)
	{
		if(sites[i].startsWith("www"))
		total++;
	}
	System.out.println("No of websites with www is"+" "+total);
	}
}
