package JavaAss;

import java.util.Scanner;

public class checkPalindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = input.next();
		input.close();
		
		
		System.out.println("Length" + str.length());
	
		System.out.println("Upper Case" + str.toUpperCase());
	
		System.out.println("is Palindrome" + str.equals((new StringBuffer(str).reverse()).toString()));
		
	}
}