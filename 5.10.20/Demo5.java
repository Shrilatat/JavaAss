package com.trg.annon;

interface Calc
{
	int add(int a , int b);
	int sub(int a , int b);
}

public class Demo5 {
	public static void main(String[] args) {
		Calc calculate = new Calc() {
			
			@Override
			public int sub(int a, int b) {
				
				return a+b;
			}
			
			@Override
			public int add(int a, int b) {
				
				return a-b;
			}
		};
		
		System.out.println(calculate.add(2, 3));
		System.out.println(calculate.sub(2, 3));
	}

}
