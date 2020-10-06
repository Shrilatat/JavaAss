package com.hsbc.anon;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public interface Interface1 {
	
	void m1();
	
	default void m2()
	{
		System.out.println("in m2");
	}
	
	static void m3()
	{
		System.out.println("in m3");
	}

}
