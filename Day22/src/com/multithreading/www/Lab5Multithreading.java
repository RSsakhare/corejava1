package com.multithreading.www;
//import java.util.Scanner;
class Threaduy extends Thread{
	
	public void run()
	{
		for(int i=1;i<11;i++)
		{
			System.out.println("i");
		}
	}
}
	
class Threadhs extends Thread{
		
		public void run()
		{
			for(int i=1;i<11;i++)
			{
				System.out.println("");
			}
		}
		
	}
	
public class Lab5Multithreading extends Thread {
	
	public static void main(String args[]) {
		 
		int x,y;
		scanner ob = new Scanner(System.in);
		x=ob.nextInt();
		y=ob.nextInt();
		
		
		ThreadOne one=new ThreadOne();
		ThreadTwo two=new ThreadTwo();
		
		one.start();
		two.start();
		ob.close();
	
	}

}