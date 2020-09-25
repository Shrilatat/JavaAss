package day6;

public class PingPong extends Thread{
	String word;

	public PingPong(String word) {
		//super();
		this.word = word;
	}
	
	public void run() {
		//System.out.println(word);
		while(true) {
			System.out.println(word);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		//Thread born, created
		Thread t1 = new PingPong("Ping");
		Thread t2 = new PingPong("Pong");
		
		
		//Runnable
		t1.start();
		t2.start();
		
		
	}
}
