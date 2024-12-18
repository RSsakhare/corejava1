package com.RefToConstructor;

public class MainClass {

	public static void main(String[] args)
	{
		PersonFactory p = Person::new;
		
		System.out.println("Constructor isn't called yet");
		System.out.println(p.get(30,"Shilpa"));
	}
}
