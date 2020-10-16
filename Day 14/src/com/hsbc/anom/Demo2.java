package com.hsbc.anom;

interface MyClass1 {
	void m1();
}

/*
 * class MySubClass extends MyClass{ //names subclass
 * 
 * @Override void m1() { System.out.println("in m1()"); } }
 */

public class Demo2 {
	public static void main(String[] args) {
		MyClass1 c = new MyClass1() { // Anonymous inner class
			@Override
			public void m1() {
				System.out.println("in m1()");
			}
		};
		c.m1();
	}
}
