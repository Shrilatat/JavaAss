package com.hsbc.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean {

	public void sayHello() {
		System.out.println("Hello World");
	}

	public HelloWorld() {
		System.out.println("In Constructer.");
	}

	public void initialize() {
		System.out.println("In Initialize.");
	}

	public void mopUp() {
		System.out.println("In Mop Up.");
	}

	public void destroy() throws Exception {
		System.out.println("In destroy.");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("In After Properties Set.");

	}
}
