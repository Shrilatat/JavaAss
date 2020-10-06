package com.hsbc.anon;

public class InterfaceDemo implements Interface1 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("in m1");
	}
	
	public static void main(String[] args) {
		Interface1 i1 = new InterfaceDemo();
		i1.m1();
		i1.m2();
		Interface1.m3(); 
	}

}
