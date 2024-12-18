package com.average.www;

public class Average {

	public static void main(String[] args){
		
		int a[]=new int[] {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		float avg=(float)sum/a.length;
		System.out.println("Average = "+avg);
		
	}
}
