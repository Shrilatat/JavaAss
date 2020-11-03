package com.trg;

import java.util.Scanner;

public class FiveDigitNum {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter any 5 digit Number: ");
		int num = Integer.parseInt(input.next());
		input.close();
		
		while(num!=0) {
			System.out.print(num%10 + " ");
			num = (int)(num/10);
		}
	}
}
