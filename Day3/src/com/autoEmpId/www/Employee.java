package com.autoEmpId.www;

public class Employee {
	
	private static int empid;
	private int empId;
	private String name;
	private float salary;
	static
	{
		empid=1;
	}
	public Employee(String name, float salary) {
		super();
		this.empId = empid++;
		this.name = name;
		this.salary = salary;
	
	}
	
	public void PrintDetails()
	{
		System.out.println("Employee Id= "+empId+"\n"+"Name= "+name+"\n"+"Salary"+salary+"\n");
	}
	

}
