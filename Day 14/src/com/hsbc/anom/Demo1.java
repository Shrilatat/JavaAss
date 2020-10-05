package com.hsbc.anom;

abstract class MyClass {
	abstract void m1();
}

/*
 * class MySubClass extends MyClass{ //names subclass
 * 
 * @Override void m1() { System.out.println("in m1()"); } }
 */

public class Demo1 {
	public static void main(String[] args) {
		MyClass c = new MyClass() {				//Anonymous inner class
			@Override
			void m1() {
				System.out.println("in m1()");
			}
		};
		c.m1();
	}
}
