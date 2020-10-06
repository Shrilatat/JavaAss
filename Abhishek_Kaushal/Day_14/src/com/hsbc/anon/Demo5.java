package com.hsbc.anon;

interface Calc{
	int add(int a,int b);
	int sub(int a,int b);
}

public class Demo5 {
	public static void main(String[] args) {
		Calc c = new Calc() {
			
			@Override
			public int sub(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
			
			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
		};
		System.out.println(c.add(5, 4));
		System.out.println(c.sub(5, 4));
	}
}
