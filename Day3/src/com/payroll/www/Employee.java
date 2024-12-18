package com.payroll.www;

public class Employee {
	
	private int employee_id;
	private String employeeName;
	private double basicSalary,hRA,medical,pF,pT,netSalary,grossSalary;

	public Employee() {
		employee_id=101;
		employeeName="John Steve";
		basicSalary=25000;
		medical=2000;
		hRA=basicSalary*0.5;
		pF=basicSalary*0.12;
		pT=200;
		
	}

	public Employee(int emp_id, String empName, double basicSal, double medi) {

		this.employee_id = emp_id;
		employeeName = empName;
		this.basicSalary = basicSal;
		this.medical = medi;
		hRA=basicSalary*0.5;
		pF=basicSalary*0.12;
		pT=200;
	}
	
	public void calculation()
	{
		grossSalary=basicSalary+hRA+medical;
		netSalary=grossSalary-(pT+pF);
	}
	public void PrintDetails()
	{
		System.out.println("Employee Id= "+employee_id+"\n"+"Employee Name= "+employeeName+"\n"+"Basic Salary= "+basicSalary+"\n"+"HRA= "+hRA+"\n"+"Medical= "+medical+"\n"+"PF= "+pF+"\n"+"PT= "+pT);
		System.out.println("Gross Salary = "+grossSalary);
		System.out.println("Net Salary= "+netSalary);
	}
	
	

	

}
