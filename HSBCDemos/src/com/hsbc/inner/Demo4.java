package com.hsbc.inner;

interface StringOp{
	void opOnString(String str);
}
public class Demo4 {
	public static void main(String[] args) {
		StringOp operator = new StringOp() {
			
			@Override
			public void opOnString(String str) {
				System.out.println(str.length());
				System.out.println(str.toUpperCase());
				System.out.println(str.charAt(str.length()-1));
				
			}
		};
		operator.opOnString("bharat");
		
		StringOp operator2 = str -> {
			System.out.println(str.length());
			System.out.println(str.toUpperCase());
			System.out.println(str.charAt(str.length()-1));
		};
		operator2.opOnString("karamchandani");
	}
}
