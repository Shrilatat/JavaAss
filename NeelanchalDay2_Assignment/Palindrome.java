import java.util.Scanner;

public class Palindrome {
		public static boolean check(String s)
		{
			int i=0; 
			int j=s.length()-1;
			
			while(i<j)
			{
				if( s.charAt(i)!=s.charAt(j)  )
					return false;
				
				i++;
				j--;
			}
			return true;
		}
		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the String ");
			
			String str = s.next();
			
			System.out.println("Length of string is " +str.length() );
			
			System.out.println(str +" in Upper case is " + str.toUpperCase());
			
			if(check(str))
			System.out.println(str+ " is a paindrome ");
			else
				System.out.println(str +  " is not a palindrome ");
			
		}
	
}
