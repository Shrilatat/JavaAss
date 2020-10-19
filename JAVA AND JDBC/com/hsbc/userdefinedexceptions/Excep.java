package com.hsbc.userdefinedexceptions;

class ExceptionHandling extends Exception {
	String str1;

	ExceptionHandling(String str2) {
		str1 = str2;
	}

	public String toString() {
		return ("Exception occurred " + str1);
	}
}

public class Excep {
	public static void main(String[] args) {

		try {
			throw new ExceptionHandling("operation invalid ");
		} catch (ExceptionHandling e) {
			System.out.println("Handled exception" + e.getMessage());
		}
	}
}