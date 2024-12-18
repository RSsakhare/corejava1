package com.array.www;

public class Date {
	
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString()
	{
		return "Date= "+day+"/"+month+"/"+year;
	}
	
	public static void Swap(Date []d)
	{
		Date temp;
		temp=d[0];
		d[0]=d[1];
		d[1]=temp;
	}

}
