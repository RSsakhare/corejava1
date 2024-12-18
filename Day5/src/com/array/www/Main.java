package com.array.www;

public class Main {

	public static void main(String[] args) {

		Date dt[] = new Date[2];
		dt[0]= new Date(12,12,2012);
		dt[1]= new Date(11,11,2011);
		
		System.out.println("Before Swap ");
		System.out.println(dt[0]);
		System.out.println(dt[1]);
		
		Date.Swap(dt);
		
		System.out.println("After Swap ");
		System.out.println(dt[0]);
		System.out.println(dt[1]);
	}

}
