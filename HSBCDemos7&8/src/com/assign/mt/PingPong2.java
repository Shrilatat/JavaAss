package com.assign.mt;

public class PingPong2 implements Runnable {
	String word;

	public PingPong2(String word) {
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
				System.out.println(e.getMessage());
			}
		}
	}

public static void main(String[] args) {
	Runnable r1 = new PingPong2("Ping");
	Runnable r2 = new PingPong2("Ping");
	
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	
	t1.start();
	t2.start();
}

}
