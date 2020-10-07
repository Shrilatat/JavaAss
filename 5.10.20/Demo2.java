package com.trg.annon;


interface Greeter
{
	void sayHello(String name);
}

public class Demo2 {
	
	public static void main(String[] args) {
		Greeter g1 = new Greeter() {
			
			@Override
			public void sayHello(String name) {
				System.out.println("Hello , " + name);
				
			}
		};
		g1.sayHello("Ritakshi");
		Greeter g2 = (str) -> System.out.println("Hello :"  + str);
		g2.sayHello("Anu");
	
	
	
	}
}
