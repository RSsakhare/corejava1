package com.countEmployee.www;

public class TestCustomer {

	public static void main(String[] args) {
		
		System.out.println("No of Customer = "+Customer.getCount());
		
		Customer c = new Customer(111,"Ram");
		c.PrintDetails();
		
		Customer c1 = new Customer(112,"Shyam");
		c1.PrintDetails();
		
		Customer c2 = new Customer(113,"Deva");
		c2.PrintDetails();
		
		System.out.println("No of Customer = "+Customer.getCount());
	}

}
