package com.hsbc.mt;

public class PingPong1 implements Runnable {

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
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println();
		}
	}
	}
	
	public static void main(String[] args) {
		Runnable r1=new PingPong1("Ping");//thread born,created
		Runnable r2=new PingPong1("Pong");
		
		//r1.setName("r1");
		//r2.setName("r2");
		//t1.setPriority(8);
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
