package com.trg.annon;

interface Adder
{
	int add(int a , int b);
}

public class Demo3 {
	public static void main(String[] args) {
		Adder a1 = new Adder() {
			
			@Override
			public int add(int a, int b) {
				int c = a+b;
				return c;
			}
		};
		
		int res = a1.add(2, 3);
		System.out.println(res);
		
		Adder c = (a,b) -> a+b;
		System.out.println(c.add(110 , 100));
		
	}
}
