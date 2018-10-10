package basicconcepts;
/*
 * This class explains creating static methods in a class and how to call them
 */
public class StaticMethodsDemo {

	public static void methodOne() {
		System.out.println("method one without output and without input");
	}
	
	public static void methodTwo(int input) {
		System.out.println("method two without output and with integer input");
		System.out.println("input is : "+input);
	}
	
	public static boolean methodThree() {
		System.out.println("method Three with boolean output and without input");
		return true;
	}
	
	public static int methodFour(int a, int b) {
		System.out.println("method four with integer output and two integer inputs");
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		StaticMethodsDemo.methodOne();
		StaticMethodsDemo.methodTwo(10);
		boolean b = StaticMethodsDemo.methodThree();
		System.out.println(b);
		int sum = StaticMethodsDemo.methodFour(10, 20);
		System.out.println(sum);
	}
}
