package basicconcepts;
/*
 * Method is a block of statements which are written to achieve certain task
 * methods without return type and without arguments
 * methods without return type and with  arguments
 * methods with return type and without arguments
 * methods with return type and with arguments
 * 
 * A method can be static or instance
 * static methods can be accessed using the class name and these are class level
 * instance methods can be accessed using the instance of the class and these are object level
 * 
 * method declaration:
 * access_modifier return_type method_name(argument1, argument2 .... argumentN){
 * 	statements inside the method are called as method body
 * }
 * 
 * method call:
 * datatype_of_returntype variable_name = method_name(parameter1, parameter2, ... parameterN);
 */
public class MethodsDemo {

	public void methodOne() {
		System.out.println("method one without output and without input");
	}
	
	public void methodTwo(int input) {
		System.out.println("method two without output and with integer input");
		System.out.println("input is : "+input);
	}
	
	public boolean methodThree() {
		System.out.println("method Three with boolean output and without input");
		return true;
	}
	
	public int methodFour(int a, int b) {
		System.out.println("method four with integer output and two integer inputs");
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		MethodsDemo obj = new MethodsDemo();
		obj.methodOne();
		obj.methodTwo(10);
		boolean r = obj.methodThree();
		System.out.println(r);
		int sum = obj.methodFour(10, 20);
		System.out.println(sum);
	}
}
