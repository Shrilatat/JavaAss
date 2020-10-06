package com.hsbc.anon;

interface Adder {
	int add(int a, int b);
}

public class Demo3 {
	public static void main(String[] args) {
		Adder a1 = new Adder() {
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		System.out.println(a1.add(4, 5));
		
		Adder a2 = (a,b) -> a+b;
		System.out.println(a2.add(5, 6));
	}

}
