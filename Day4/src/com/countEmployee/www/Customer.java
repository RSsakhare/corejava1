package com.countEmployee.www;

public class Customer {

	private int customerId;
	private String name;
	private static int count;
	public Customer(int customerId, String name) {
	
		this.customerId = customerId;
		this.name = name;
		count++;
	}
	public void PrintDetails()
	{
		System.out.println("Customer ID= "+customerId+"\n"+"Name = "+name);
	}
	public static int getCount()
	{
		return count;
	}
}
