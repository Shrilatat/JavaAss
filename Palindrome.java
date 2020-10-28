import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		sc.close();
		
		System.out.println("Length of String is : " + str.length());
		
		System.out.println("Uppercase string : " + str.toUpperCase()); 
		
		String str2 = "";
		
		for(int i = str.length()-1 ; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		
		System.out.println(str + "   " + str2);
		
		if(str.equals(str2)) {
			System.out.println("String is a palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
		
	}

}
