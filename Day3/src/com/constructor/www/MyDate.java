package com.constructor.www;

public class MyDate {
	private int day,month,year;
	

	public MyDate() {
		day = 10;
		month = 10;
		year = 2010;
		
	}


	public MyDate(int d, int m, int y) {
	
		day = d;
		month = m;
		year = y;
	}
	
	public void Print()
	{
		System.out.println("Date :- "+day+"/"+month+"/"+year);
	}
	

}
