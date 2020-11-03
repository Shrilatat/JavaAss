import java.util.Scanner ;

public class Websites {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println(" no. of websites : ");
		
		String num = sc.next();
		
		int n = Integer.parseInt(num);
		int ct = 0 ;
		
		System.out.println("Websites : ");
		
		for(int i=0 ; i<n ; i++)
		{
			String s = sc.next();
			if(s.startsWith("www"))
				ct++;
		}
		
		System.out.println("Websites start with www : " + ct);
		
	}
}
