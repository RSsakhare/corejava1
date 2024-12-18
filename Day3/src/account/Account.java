package account;

public class Account {
	private static float interestRate;
	static
	{
		interestRate=7.8f;
	}
	public static float getInterest()
	{
		return interestRate;
	}
	

}
