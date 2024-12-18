package com.RefToConstructor;

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


	@Override
	public String toString() {
		return "name=" + name+"----"+"age is " + age ;
	}
	
	

}
