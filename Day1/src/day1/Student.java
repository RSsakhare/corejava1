package day1;

public class Student {
	private int rollNo;
	private String name;
	private double percentage;
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public void initStudent()
	{
		rollNo=10;
		name="Shivam";
		percentage=76.98;
	}
	
	public void printDetails()
	{
		System.out.println("Roll no : "+rollNo);
		System.out.println("Name : "+name);
		System.out.println("Percentege : "+percentage);
	}

}
