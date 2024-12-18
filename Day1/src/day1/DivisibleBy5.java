package day1;
import java.util.Scanner;

public class DivisibleBy5 {
	public static void main(String[] args) {
		int num;
		Scanner d=new Scanner(System.in);
		num=d.nextInt();
		if(num%5==0)
		{
			System.out.println("Divisible by 5");
		}
		else
		{
			System.out.println("Not divisible by 5");
		}
		d.close();
	}
	
 
}
