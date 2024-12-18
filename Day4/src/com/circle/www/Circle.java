package com.circle.www;

public class Circle {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void CalculateArea()
	{
		System.out.println("Area of circle = "+3.14*radius*radius);
	}
	
	public void Calculateperimeter()
	{
		System.out.println("perimeter of circle = "+2*3.14*radius);
	}
}
