package com.trg.annon;

interface Interface1 {
void m1();

default void m4()
{
	System.out.println("m4");
}

default void m2()
{
	System.out.println("in m2");
}

static void m3()
{
	System.out.println("in m3");
}



}

public class InterfaceDemo implements Interface1{
	
	public void m1()
	{
		System.out.println("in m1");
	}
	public void m4()
	{
		System.out.println("m4 , my own impl");
	}
	
	public static void main(String[] args) {
		
		Interface1 i1 = new InterfaceDemo();
		i1.m1();
		i1.m2();
		i1.m4();
		Interface1.m3();
		
	}

}
