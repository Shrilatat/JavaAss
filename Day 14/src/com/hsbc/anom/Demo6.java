package com.hsbc.anom;

interface Calc {
	int add(int a, int b);

	int sub(int a, int b);
}

public class Demo6 {
	public static void main(String[] args) {
		Calc obj = new Calc() { // Anonymous inner class
			@Override
			public int add(int a, int b) {
				return (a + b);
			}

			@Override
			public int sub(int a, int b) {
				return (a - b);
			}
		};
		System.out.println(obj.add(20, 10));
		System.out.println(obj.sub(20, 10));
	}
}
