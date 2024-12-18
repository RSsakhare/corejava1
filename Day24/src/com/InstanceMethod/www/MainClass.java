package com.InstanceMethod.www;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args)
	{

		ArrayList <Person> arr = new ArrayList<Person>();
		
		arr.add(new Person(23,"Neelam"));
		arr.add(new Person(27,"Prisha"));
		arr.add(new Person(25,"Anay"));
		

		PersonComparator obj = new PersonComparator();
		Collections.sort(arr, obj::compareName);
		for(Person p : arr)
		{
			System.out.println(p.getName()+"-----"+p.getAge());
		}
	}
}
