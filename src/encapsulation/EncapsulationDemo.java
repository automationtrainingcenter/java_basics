package encapsulation;

public class EncapsulationDemo {
	private int id;
	private String name;
	private double balance;
	private String address;

	public EncapsulationDemo(int id, String name, double balance, String address) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.address = address;
	}

	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		}
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("deposite success");
		} else {
			System.out.println("invlaid amount ... can't process the transaction");
		}
	}

	public double withdraw(double amount) {
		double a = 0;
		if (amount > 0) {
			if (amount <= this.balance) {
				this.balance -= amount;
				System.out.println("withdraw success ... Please collect your cash");
				a = amount;
			} else {
				System.out.println("no sufficient balance");
			}
		} else {
			System.out.println("invalid amount ... can't process the transaction");
		}

		return a;

	}

}
