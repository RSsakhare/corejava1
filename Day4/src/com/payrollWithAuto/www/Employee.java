package com.payrollWithAuto.www;

	public class Employee {
		private static int nextEmpId;
		private int employee_id;
		private String employeeName;
		private double basicSalary,hRA,medical,pF,pT,netSalary,grossSalary;

		
		
		public Employee() {
			
			employee_id=++nextEmpId;
			employeeName="John Steve";
			basicSalary=25000;
			medical=2000;
			hRA=basicSalary*0.5;
			pF=basicSalary*0.12;
			pT=200;
			
		}
		public Employee(String employeeName, double basicSalary, double medical) {
			
			employee_id=++nextEmpId;
			this.employeeName = employeeName;
			this.basicSalary = basicSalary;
			this.medical = medical;
			this.hRA=basicSalary*0.5;
			this.pF=basicSalary*0.12;
			this.pT=200;
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
			System.out.println("Net Salary= "+netSalary+"\n");
		}
		
		public static int getEmployeeCount()
		{
			return nextEmpId;
		}

		

	}

