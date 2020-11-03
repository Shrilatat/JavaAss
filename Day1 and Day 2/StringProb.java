package com.trg;

import java.util.Scanner;

public class StringProb {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String: ");
		
		String str = input.next();
		input.close();
		
		int i=0; int j=str.length()-1;
		boolean r = true;
		while(i<j) {
			char s = str.charAt(i);
			char e = str.charAt(j);
			if(s!=e) {
				r=false;
				break;
			}
			else {
				i++;
				j--;
			}
		}
		
		System.out.println("Length of string is = " + str.length());
		
		System.out.println("Upper Case for the required string= " + str.toUpperCase());

		System.out.println("is it a palindrome? " + r);
		
	}
}
