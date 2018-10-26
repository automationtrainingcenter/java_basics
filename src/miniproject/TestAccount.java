package miniproject;

public class TestAccount {
	
	public static void main(String[] args) {
		Account dharani = new SavingsAccount("dharani", "JNTU", 30000);
		Account tejaswi = new SavingsAccount("tejaswi", "KPHB", 20000);
		
		dharani.displayAccountInfo();
		dharani.deposite(5000);
		dharani.displayBalance();
		dharani.withdraw(10000);
		dharani.displayBalance();
		
		
		tejaswi.displayAccountInfo();
		tejaswi.deposite(-5000);
		tejaswi.displayBalance();
		tejaswi.withdraw(-10000);
		tejaswi.displayBalance();
		
	}

}
