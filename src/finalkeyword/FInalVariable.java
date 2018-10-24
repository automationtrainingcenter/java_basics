package finalkeyword;

public class FInalVariable {

	static int normalVar = 10;
	static final int finalVar = 100;

	public static void main(String[] args) {
		System.out.println("before changing the values are " + normalVar + " " + finalVar);
		normalVar = 20;
//		finalVar = 1000;
		System.out.println("after changing the values are " + normalVar + " " + finalVar);
	}

}
