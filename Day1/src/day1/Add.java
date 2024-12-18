package day1;
import java.util.Scanner;

public class Add {
	public static void main(String[] args)
	{
		int x, y;
		Scanner ob =new Scanner(System.in);
		x=ob.nextInt();
		y=ob.nextInt();
		
		int tot=x+y;
		System.out.println("addition="+tot);
		ob.close();
	}
}
