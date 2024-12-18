package com.instanceObjectRef.www;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String[] strArray = {"Pune","Mumbai","chennai","Kolkata","New Delhi"};
		
		Arrays.sort(strArray, String::compareToIgnoreCase);
		
		for(String str:strArray)
		{
			System.out.println(str+" ");
		}
	}

}
