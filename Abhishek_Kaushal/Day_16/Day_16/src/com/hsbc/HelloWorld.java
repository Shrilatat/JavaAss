package com.hsbc;

import javax.annotation.PostConstruct;

public class HelloWorld {
	
	public void sayHello() {
		System.out.println("Hello World");
	}
	
	@PostConstruct
	public void abc()
	{
		
	}

}
