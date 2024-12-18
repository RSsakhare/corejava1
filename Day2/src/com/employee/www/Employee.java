package com.employee.www;

public class Employee {
	private int emp_id;
	private String firstName,lastName,jobTitle;
	private double salary;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int e_id) {
		emp_id = e_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fName) {
		firstName = fName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lName) {
		lastName = lName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jTitle) {
		jobTitle = jTitle;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double sal) {
		this.salary = sal;
	}
	
	public void Print()
	{
		System.out.println(" employee_id = "+emp_id+"\n"+ " firstName=" + firstName+"\n"+ " lastName=" + lastName+"\n" + " jobTitle="+ jobTitle +"\n"+ " salary=" + salary);
	}

}
