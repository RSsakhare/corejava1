package day1;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.initStudent();
		s.printDetails();
		s.setRollNo(20);
		s.setName("Ram");
		s.setPercentage(98.09);
		s.printDetails();
		System.out.println(s.getRollNo());
	}

}
