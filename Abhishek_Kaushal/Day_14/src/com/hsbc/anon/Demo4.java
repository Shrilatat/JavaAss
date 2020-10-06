package com.hsbc.anon;

interface StringOp{
	void opOnString(String str);
}

public class Demo4 {
	public static void main(String[] args) {
		StringOp op = new StringOp() {
			
			@Override
			public void opOnString(String str) {
				System.out.println(str.length());
				System.out.println(str.toUpperCase());
				System.out.println(str.charAt(3));
				
			}
		};
		op.opOnString("Abhishek");
		
		StringOp op2 = str -> {
			System.out.println(str.length());
			System.out.println(str.toUpperCase());
			System.out.println(str.charAt(3));
		};
		op2.opOnString("kaushal");
	}
	
}
