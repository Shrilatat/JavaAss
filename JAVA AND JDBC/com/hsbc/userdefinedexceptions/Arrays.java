package com.hsbc.userdefinedexceptions;

public class Arrays {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		try {
			num[5] = 6;
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Exception Handled \n" + a.toString());
		}
	}
}
