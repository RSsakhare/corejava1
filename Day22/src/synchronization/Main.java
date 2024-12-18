package synchronization;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account obj = new Account(10000);
		
		Transaction t1 = new Transaction("Ram",obj);
		Transaction t2 = new Transaction("Syam",obj);
		
		t1.start();
		t2.start();
	}


}
