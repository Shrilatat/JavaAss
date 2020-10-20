package com.hsbc.inner;

interface Adder{
	int add(int a, int b);
}
public class Demo3 {
	public static void main(String[] args) {
		Adder adder = new Adder() {
			
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		
		int result = adder.add(3, 5);
		System.out.println(result);
		
		Adder adder2 = (a,b) -> a+b;
		System.out.println(adder2.add(9, 8));
	}
}
