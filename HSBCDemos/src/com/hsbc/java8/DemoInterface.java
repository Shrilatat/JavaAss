package com.hsbc.java8;

public class DemoInterface implements Interface1{

	@Override
	public void m1() {
		System.out.println("in m1()");
		
	}
	
	public void m2() {
		System.out.println("in m2() of DEMOINTERFACE");
	}
	
	public static void main(String[] args) {
		Interface1 i1 = new DemoInterface();
		i1.m1();
		i1.m2();
		Interface1.m3();
		
	}
}
