package com.hsbc.inner;

interface Greeter{
	void sayHello(String name);
}
public class Demo2 {
	public static void main(String[] args) {
		Greeter greet = new Greeter() {
			
			@Override
			public void sayHello(String name) {
				System.out.println("Hello "+name);
				
			}
		};
		
		greet.sayHello("Bharat");
		
		Greeter greet2 = str -> System.out.println("Hello "+ str);
		greet2.sayHello("bk");
	}
}
