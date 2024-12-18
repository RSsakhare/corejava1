package com.classroom.www;

public class ClassRoom {
	private int standard,rollNo;
	private char division;
	private String studentName;
	public int getStandard() {
		return standard;
	}
	public void setStandard(int stand) {
		standard = stand;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rNo) {
		rollNo = rNo;
	}
	public char getDivision() {
		return division;
	}
	public void setDivision(char div) {
		division = div;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String sName) {
		studentName = sName;
	}
	
	public void Print()
	{
		System.out.println("Standard = "+standard+"\n"+"Division = "+division+"\n"+"StudentName = "+studentName+"\n"+"Roll No = "+rollNo);
	}

}
