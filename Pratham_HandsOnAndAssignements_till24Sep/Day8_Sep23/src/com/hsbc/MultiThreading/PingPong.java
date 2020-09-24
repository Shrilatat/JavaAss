package com.hsbc.MultiThreading;

public class PingPong extends Thread{
	String message;

	public PingPong(String message) {
		this.message = message;
	}
	
	public void run() {
		if(Thread.currentThread().getName().equals("T1"))
			m1();
		else	
			m2();
	}
	
	
	public static void main(String[] args) {
		Thread t1= new PingPong("Ping");
		Thread t2 = new PingPong("Pong");
		t1.setName("T1");
		t2.setName("T2");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		t2.start();
		
	}

	public void m1() {
		System.out.println("In m1()");
	}
	
	public void m2() {
		System.out.println("In m2()");
	}

}
