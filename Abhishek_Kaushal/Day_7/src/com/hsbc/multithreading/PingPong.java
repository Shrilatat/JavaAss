package com.hsbc.multithreading;

public class PingPong extends Thread  {
	String word;

	public PingPong(String word) {
		this.word = word;
	}
	
	public void run()
	{
		//System.out.println(word);
//		while(true)
//		{
//			System.out.println(word);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				System.out.println(e.getMessage());
//			}
//		}
		if(Thread.currentThread().getName().equals("t1"))
		{
			m1();
		}
		else
		{
			m2();
		}
	}
	
	public void m1() {
		System.out.println("in m1");
	}

	public void m2() {
		System.out.println("in m2");
	}
	
	public static void main(String[] args) {
		Thread t1 = new PingPong("Ping");
		Thread t2 = new PingPong("Pong");
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getName() + t2.getName());
		
		t1.start(); // runnable state
		t2.start(); // runnable state
		
	}
}
