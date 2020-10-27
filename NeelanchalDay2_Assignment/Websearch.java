import java.util.Scanner;

public class Websearch {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number of websites");
		String n = s.next();

		int no = Integer.parseInt(n);
		
		System.out.println("Enter websites");
		
		String[] str = new String[no];

		for (int i=0 ; i<no ; i++)
			str[i] = s.next();

				int count=0;
				for(int i=0 ; i<no; i++)
				{
					if(str[i].startsWith("www"))
						count++;
				}
				System.out.println("No of webstites containing www. is "+ count);
	}
}
