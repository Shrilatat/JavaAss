package com.hsbc.mt;
//setName getName sleep() run start getPriority
public class PingPong extends Thread{
	String word;

	public PingPong(String word) {
	
		this.word = word;
	}
	public void run()
	{
		if(Thread.currentThread().getName().equals("t1"))
			m1();
		else
			m2();
//		while(true)
//		{
//		System.out.println(word);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println();
//		}
//		}
	}
	public static void main(String[] args) {
	Thread t1=new PingPong("Ping");//thread born,created
	Thread t2=new PingPong("Pong");
	
	t1.setName("t1");
	t2.setName("t2");
	t1.setPriority(8);
	System.out.println(t1.getPriority());

	//t1.start();//runnable
	//t2.start();
	}
	public void m1()
	{
		System.out.println("in m1");
	}
	public void m2()
	{
		System.out.println("in m2");
	}
}
