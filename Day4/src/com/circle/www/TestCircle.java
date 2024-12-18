package com.circle.www;

public class TestCircle {

	public static void main(String[] args) {

		Circle c =new Circle();
		c.setRadius(4.5);
		System.out.println("Radius of circle = "+c.getRadius());
		c.CalculateArea();
		c.Calculateperimeter();
	}

}
