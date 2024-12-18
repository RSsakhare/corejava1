package com.executeBeforeMain.www;

public class BeforeMain {
	
	
	static
	{
		System.out.println("Static Block 1");
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Block");
		
	}
	
	
	static 
	{
		System.out.println("Static Block 2");
		
	}

}
