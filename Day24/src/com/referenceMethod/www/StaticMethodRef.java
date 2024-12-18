package com.referenceMethod.www;

import java.util.ArrayList;
import java.util.Collections;

public class StaticMethodRef {

	public static void main(String[] args) {
		
		ArrayList <Person> arr = new ArrayList<Person>();
		
		arr.add(new Person(23,"Neelam"));
		arr.add(new Person(27,"Prisha"));
		arr.add(new Person(25,"Anay"));
		

		Collections.sort(arr,PersonComparator::compareAge);
		for(Person p : arr)
		{
			System.out.println(p.getAge());
		}
	}

}
