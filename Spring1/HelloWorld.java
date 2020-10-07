package com.trg;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean , DisposableBean {
	
	public void sayHello()
	{
		System.out.println("Hello World");
	}
	
	public void initialize()
	{
		System.out.println("In initialize");
	}
	
	public void mopUp()
	{
		System.out.println("In MopUp()");
	}

	public HelloWorld() {
		System.out.println("In constructor");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("In destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	     System.out.println("In afterPropertiesSet");
		
	}
	
	

}
