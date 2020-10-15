package com.hsbc.thread;

public class PingPong1 implements Runnable {
	
	String word;

	public PingPong1(String word) {
		this.word = word;
	}
	
	public void run() {
		while(true) {
			System.out.println(word);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
	}
	
	public static void main(String[] args) {
		Runnable r1 = new PingPong1("Ping");
		Runnable r2 = new PingPong1("Pong");
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
