import java.util.Scanner;

public class palindrome {

	public static void main(String[] args)
	{
		String s;
		Scanner sc = new Scanner(System. in );
		s=sc.nextLine();
		int p=s.length();
		System.out.println("The length of the String "+ s + " is "+ p);
		
		String up=s.toUpperCase();
		System.out.println("The UpperCase of the String "+ s + " is "+ up);
		
		String reverse="";
		for (int i = p - 1; i >= 0; i--)
		      reverse = reverse + s.charAt(i);
		System.out.println(reverse);
		    if (s.equals(reverse))
		      System.out.println("The string is a palindrome.");
		    else
		      System.out.println("The string isn't a palindrome.");
	}
	
}