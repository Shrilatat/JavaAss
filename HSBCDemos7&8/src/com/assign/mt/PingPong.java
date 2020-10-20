package com.assign.mt;

public class PingPong extends Thread{
	
	String word;

	public PingPong(String word) {
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
	Thread t1 = new PingPong("Ping");
	Thread t2 = new PingPong("Pong");
	
	t1.start();
	t2.start();
}


}



