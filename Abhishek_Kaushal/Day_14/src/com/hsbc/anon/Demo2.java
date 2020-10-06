package com.hsbc.anon;

interface Greeter{
	void sayHello(String name);
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter g1 = new Greeter() {
			
			@Override
			public void sayHello(String name) {
				// TODO Auto-generated method stub
				System.out.println("Hello "+name);
				
			}
		};
		g1.sayHello("Abhishek");
		
		Greeter g2 = str -> System.out.println("Hello "+str);
		g2.sayHello("kaushal");
		
	}

}
