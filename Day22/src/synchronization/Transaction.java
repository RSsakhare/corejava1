package synchronization;

public class Transaction extends Thread{
	
Account aob;
	
	
	
	public Transaction(String name,Account aob) {
		super(name);
		this.aob = aob;
	}



	public void Withdraw(int amount) {
		
		synchronized (aob){
		int b=aob.getBalanace();
		System.out.println("****** balance before withdraw"+b);
		b=b-amount;
		aob.setBalanace(b);
		System.out.println("****** balance after withdraw"+b);
		
	}
}


	public void Deposit(int amount) {
		
		synchronized (aob){
			int b=aob.getBalanace();
		System.out.println("****** balance before Deposit"+b);
		b=b+amount;
		aob.setBalanace(b);
		System.out.println("****** balance after Deposit"+b);
		
	}
}
	
	public void run() {
		if(Thread.currentThread().getName().equals("Ram"))
			Deposit(2000);
		if(Thread.currentThread().getName().equals("Syam"))
			Withdraw(1000);
	}


}
