package com.hsbc.inner;


interface Calc{
	int add(int a , int b);
	int sub(int a, int b);
}
public class Demo5 {
	public static void main(String[] args) {
		Calc calculator = new Calc() {
			
			@Override
			public int add(int a, int b) {
				return a+b;
			}
			
			@Override
			public int sub(int a, int b) {
				return a-b;
			}
		};
		
		System.out.println(calculator.add(3, 5));
		System.out.println(calculator.sub(5, 3));
		
		//Lambda like demo1,demo2,demo3,demo4 wont work here as interface is not a functional interface i.e. it has multiple functions instead of one
	}
}
