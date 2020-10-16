package com.hsbc.anom;

interface Greeter {
	void sayHello(String name);
}

public class Demo3 {
	public static void main(String[] args) {
		Greeter obj = new Greeter() {				//Anonymous inner class
			@Override
			public void sayHello(String name) {
				System.out.println("Hello "+name);
			}
		};
		obj.sayHello("Amisha");
	}
}
