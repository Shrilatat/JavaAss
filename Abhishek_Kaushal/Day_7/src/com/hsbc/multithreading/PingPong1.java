package com.hsbc.multithreading;

public class PingPong1 implements Runnable  {
	String word;

	public PingPong1(String word) {
		this.word = word;
	}
	
	public void run()
	{
		while(true)
		{
			System.out.println(word);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	public void m1() {
		System.out.println("in m1");
	}

	public void m2() {
		System.out.println("in m2");
	}
	
	public static void main(String[] args) {
		Runnable r1 = new PingPong1("Ping");
		Runnable r2 = new PingPong1("Pong");
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getName() + " "+t2.getName());
		
		t1.start(); // runnable state
		t2.start(); // runnable state
		
	}
}
