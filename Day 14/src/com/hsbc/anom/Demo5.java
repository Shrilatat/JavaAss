package com.hsbc.anom;

interface StringOP {
	void opOnString(String str);
}

public class Demo5 {
	public static void main(String[] args) {
		StringOP obj = new StringOP() { // Anonymous inner class
			@Override
			public void opOnString(String str) {
				System.out.println("Length => " + str.length());
				System.out.println("Upper Case => " + str.toUpperCase());
				System.out.println("Lower Case => " + str.toLowerCase());
				System.out.println("Last Index => " + str.charAt(str.length() - 1));

			}
		};
		obj.opOnString("Amisha");
	}
}
