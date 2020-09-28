package com.hsbc.multithreading;

public class PingPong extends Thread {

	String word;

	public PingPong(String word) {
		this.word = word;
	}

	public void run() {
		while (true) {
			System.out.println(word);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {

		Thread t1 = new PingPong("Ping"); // thread born/created
		Thread t2 = new PingPong("Pong");

		t1.start(); // runnable
		t2.start();
		
	}

}
