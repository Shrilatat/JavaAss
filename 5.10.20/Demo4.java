package com.trg.annon;

interface StringOp
{
	void opOnString(String str);
}

public class Demo4 {
	public static void main(String[] args) {
		StringOp op = new StringOp() {
			
			@Override
			public void opOnString(String str) {
				System.out.println("string length is: "+ str.length());
				System.out.println("string in upper case is: "+str.toUpperCase());
				System.out.println("string at last index is: "+str.charAt(str.length()-1 ));
			}
			
		};
		
		op.opOnString("Ritakshi");
		
		
		StringOp op1 = str -> {
			System.out.println("string length is: "+ str.length());
			System.out.println("string in upper case is: "+str.toUpperCase());
			System.out.println("string at last index is: "+str.charAt(str.length()-1 ));

			
		};
	}

}
