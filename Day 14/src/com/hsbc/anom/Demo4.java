package com.hsbc.anom;

interface Adder {
	int add(int a, int b);
}

public class Demo4 {
	public static void main(String[] args) {
		Adder obj = new Adder() {				//Anonymous inner class
			@Override
			public int add(int a, int b) {
				return (a+b);
			}
		};
		System.out.println(obj.add(5,6));
	}
}
