package com.fileIO.www;

import java.io.Console;

public class ConsoleClass {
	
	public static void main(String[] args)
	{
		Console con=System.console();
		
		if(con!=null)
		{
			String name=con.readLine("Please Enter Your Name");
			char []password=con.readPassword("Please Enter Your Password");
			
			System.out.println("Hello"+name+"Your Login is Successful");
			
			String st=String.valueOf(password);
			System.out.println(st);
			
		}
		
		else
		{
			System.out.println("console is empty");
		}
	}

}
