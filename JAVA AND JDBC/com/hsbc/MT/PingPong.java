package com.hsbc.MT;

public class PingPong extends Thread{
	
	public PingPong(String word) {
		super();
		wor = word;
	}
	String wor;

	public void run(){System.out.println(wor);}
	
	public static void main(String[] args) {
		Thread t1 = new PingPong("Ping");
		Thread t2 = new PingPong("Pong");
		
		t1.start();
		t2.start();
	}
}
