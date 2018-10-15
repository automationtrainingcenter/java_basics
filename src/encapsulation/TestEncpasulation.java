package encapsulation;

public class TestEncpasulation {
	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo(101, "vidya", 10000, "miyapur");
		System.out.println(obj.getAddress());
//		obj.balance;
		obj.deposite(-2000);
		System.out.println(obj.getBalance());
		
		double amount = obj.withdraw(12000);
		System.out.println(amount);
		
		System.out.println(obj.getBalance());
		amount = obj.withdraw(10000);
		System.out.println(amount);
		
		amount = obj.withdraw(-10000);
		System.out.println(amount);
		
		System.out.println(obj.getBalance());		
//		if(bal < 10000) {
//			System.out.println("your account balance is less than Min balance");
//		}
	}
}
