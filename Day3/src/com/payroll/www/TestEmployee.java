package com.payroll.www;

public class TestEmployee {

	public static void main(String[] args) {
		
		System.out.println("Employee 1 :-\n");
		Employee e =new Employee();
		e.calculation();
		e.PrintDetails();
		System.out.println("\n");
		System.out.println("Employee 2 :-\n");
		Employee e1 = new Employee(102,"Ram",30000,1000);
		e1.calculation();
		e1.PrintDetails();
	}

}
