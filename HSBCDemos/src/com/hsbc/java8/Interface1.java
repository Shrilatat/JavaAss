package com.hsbc.java8;

@FunctionalInterface
public interface Interface1 {
	void m1();
//	void m2();      //functional interface, only one abstract method
	
	default void m2() {
		System.out.println("in m2()");
	}
	
	static void m3() {
		System.out.println("in m3()");
	}
}
