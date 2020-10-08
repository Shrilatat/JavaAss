package com.hsbc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld {
	
	public void sayHello() {
		System.out.println("hello world");
	}
}

/*
 * InitializingBean, DisposableBean
 * Spring specific interfaces, Purity of bean gone
 * */

