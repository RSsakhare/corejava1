package com.containment.www;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e = new Employee();
		System.out.println(e);
		
		System.out.println();
		
		Employee e1 = new Employee(102,"Syam",new Date(11,11,2011));
		System.out.println(e1);
	}

}
