package com.varArgument.www;

public class Student {
	
	
	
	public static void Average(String name,int...marks)
	{
		 int sum=0;
		for(int x:marks)
		{
			
			sum=sum+x;
		}
		double avg;
		avg=sum/marks.length;
		System.out.println("name= "+name);
		System.out.println("Average= "+avg);
	}
	
	public static void main(String[] args)
	{
		Student.Average("Ram",10,40,55,62);
	}

}
