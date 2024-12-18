package com.car.www;

public class TestCar {

	public static void main(String[] args) {

		Car c =new Car(35.2);
		c.setCompany_name("Honda");
		c.setModel_name("Verna");
		c.setYear(2022);
		
		System.out.println("Company Name="+c.getCompany_name()+"\n"
				+ "Model Name="+c.getModel_name()+"\n"
				+ "Year="+c.getYear()+"\n"
				+ "Mileage="+c.getMileage());
	}

}
