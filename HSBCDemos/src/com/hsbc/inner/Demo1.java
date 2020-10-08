package com.hsbc.inner;

abstract class MyClass {
	abstract void m1();
}

interface I1 {
	void m1();
}

/*
 * class MySubClass extends MyClass{
 * 
 * @Override void m1() { // TODO Auto-generated method stub
 * System.out.println("in m1()"); } }
 */

public class Demo1 {
	public static void main(String[] args) {
		MyClass c = new MyClass() {

			@Override
			void m1() {
				System.out.println("in m1()");

			}
		};
		c.m1();
		
		/*
		 * I1 i1 = new I1() {
		 * 
		 * @Override public void m1() { System.out.println("in m1 of interface");
		 * 
		 * } };
		 */
		
		I1 i1 = () -> System.out.println("in m1 of interface");
		i1.m1();
	}
}
