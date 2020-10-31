package demo.sts.day2;

import java.util.Scanner;

public class stringAss {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String: ");
		String inString = input.next();
		input.close();
		
		// Length of String
		System.out.println("Length of String = " + inString.length());
		// Upper Case
		System.out.println("in Upper Case = " + inString.toUpperCase());
		// Palindrome Check
		System.out.println("Palindrome Check = " + inString.equals((new StringBuffer(inString).reverse()).toString()));
		
	}
}
