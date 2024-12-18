package day1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner ob=new Scanner(System.in);
		year=ob.nextInt();
		if(year%4==0||year%100==0&&year%400==0)
		{
			System.out.println("Leap Year");
			
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
		ob.close();
	}

}
