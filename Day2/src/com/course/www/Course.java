package com.course.www;

public class Course {
	private String courseName,trainingPartner,courseDescri;
	private int course_id;
	private double fees;
	public double getFees() {
		return fees;
	}
	public void setFees(double f) {
		fees = f;
	}
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String cName) {
		courseName = cName;
	}
	public String getTrainingPartner() {
		return trainingPartner;
	}
	public void setTrainingPartner(String tPartner) {
		trainingPartner = tPartner;
	}
	public String getCourseDescri() {
		return courseDescri;
	}
	public void setCourseDescibtion(String courseDesc) {
		courseDescri = courseDesc;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int c_id) {
		course_id = c_id;
	}
	public void Print()
	{
		System.out.println("Course ID= "+course_id+"\n"+"Course Name= "+courseName+"\n"+"Training Provider= "+trainingPartner+"\n"+"Course Describtion= "+courseDescri+"\n"+"Fees = "+fees);
	}
}
