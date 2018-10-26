package miniproject;

public abstract class AccountImpl implements Account {

	protected String name;
	protected String address;
	protected int balance;

	protected AccountImpl(String name, String address, int balance) {
		this.name = name;
		this.address = address;
		this.balance = balance;
	}

	public void deposite(int amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("deposite success");
		} else {
			System.out.println("transaction failed");
		}
	}

	public void withdraw(int amount) {
		if (this.balance >= amount && amount > 0) {
			this.balance -= amount;
			System.out.println("withdraw success");
		} else {
			System.out.println("transaction failed");
		}
	}

	public void displayBalance() {
		System.out.println(this.balance);
	}

	public void displayAccountInfo() {
		System.out.println("name : " + this.name + "\naddress : " + this.address);
	}

}
