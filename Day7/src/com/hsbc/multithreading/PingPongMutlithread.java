package com.hsbc.multithreading;

public class PingPongMutlithread extends Thread {
	String word;
	public PingPongMutlithread(String word) {
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
		// TODO Auto-generated method stub
		Thread t1 = new PingPongMutlithread("Ping"); // thread born/created
		Thread t2 = new PingPongMutlithread("Pong");

		t1.start(); // runnable
		t2.start();

	}

}
