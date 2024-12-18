package com.payrollWithAuto.www;


public class TestEmployee {

	public static void main(String[] args) {

		
		Employee e =new Employee();
		e.calculation();
		e.PrintDetails();
		
		
		Employee e1 = new Employee("Ram",30000,1000);
		e1.calculation();
		e1.PrintDetails();
		
		System.out.println("No of Employees = "+Employee.getEmployeeCount());
	}

}
