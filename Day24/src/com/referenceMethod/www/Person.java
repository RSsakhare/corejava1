package com.referenceMethod.www;

public class Person {
	private int age;
	private String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	
}

class PersonComparator
{
	public static int compareAge(Person a,Person b)
	{
		return a.getAge() - b.getAge();
	}
}

