package com.containment.www;

public class Employee {
	
	private int empId;
	private String name;
	private Date doj;
	
	public Employee() {
		
		empId=101;
		name="Ram";
		doj=new Date();
	}
	
	

	
	public Employee(int empId, String name, Date doj) {
		this.empId = empId;
		this.name = name;
		this.doj = doj;
	}




	public String toString() {
		return "empId=" + empId +"\n"+ "name= " + name +"\n" +"DateOfJoinig= " + doj;
	}
	
	
	
	
}
