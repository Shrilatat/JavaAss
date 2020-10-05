package com.hsbc.javaFeatures;

interface Interface1{
	
	void m1();
	
	default void m2() {
		System.out.println("in m2() of Interface1");
	}
	
	static void m3() {
		System.out.println("in m3() of Interface1");
	}
}

public class InterfaceDemo implements Interface1{
	
	public void m1() {
		
	}

}
