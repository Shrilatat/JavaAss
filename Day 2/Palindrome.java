import java.util.Scanner;
public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String");
		
		String str1 = s.next();
		String str = str1.toUpperCase();
		int l = str.length();
		
		System.out.println("Length of string= "+l);
		System.out.println(str);
		
		int i=0, j=l-1, flag=0;
		
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=1;
				break;
			}
			i++;
			j--;
		}
		if(flag==0)
			System.out.println("String is a palindrome");
		else
			System.out.println("String is NOT a palindrome");
	}
}
