package com.hsbc.MultiThreading;

public class PingPong1 implements Runnable{
	String message;

	public PingPong1(String message) {
		this.message = message;
	}
	
	public void run() {
		if(Thread.currentThread().getName().equals("Thread-0"))
			m1();
		else	
			m2();
	}
	
	
	public static void main(String[] args) {
		Runnable r1= new PingPong1("Ping");
		Runnable r2 = new PingPong1("Pong");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
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
