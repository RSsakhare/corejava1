package com.multithreading.www;

class ThreadOne extends Thread{
	
	public void run()
	{
		for(int i=1;i<4;i++)
		{
			System.out.println("Thread one");
			Thread.yield();
		}
	}
	

}

class ThreadTwo extends Thread{
	
	public void run()
	{
		for(int i=1;i<4;i++)
		{
			System.out.println("Thread two");
		}
	}
	
}

public class MainThread{
	public static void main(String args[]) {
		
		ThreadOne one=new ThreadOne();
		ThreadTwo two=new ThreadTwo();
		
		one.start();
		two.start();
	
	}
}