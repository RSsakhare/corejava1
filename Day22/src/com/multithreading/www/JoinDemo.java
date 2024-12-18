package com.multithreading.www;

public class JoinDemo extends Thread {
	
	public void run() {
		for(int i=1;i<4;i++) {
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			System.out.println("thread"+i);
		}
		
	}
	public static void main(String args[]) {
		
		JoinDemo t1 = new JoinDemo();
		JoinDemo t2 = new JoinDemo();
		JoinDemo t3 = new JoinDemo();
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
	
}
