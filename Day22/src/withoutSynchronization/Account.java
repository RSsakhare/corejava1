package withoutSynchronization;

public class Account {

	
	private int balanace;
	
	public Account( int balanace) {
		
		this.balanace = balanace;
	}


	public void setBalanace(int balanace) {
		this.balanace = balanace;
	}

	public int getBalanace() {
		return balanace;
	}


	@Override
	public String toString() {
		return "Account [balanace=" + balanace + "]";
	}

	
	
	
	
	
}
