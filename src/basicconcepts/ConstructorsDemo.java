package basicconcepts;

import java.util.Scanner;

/*
 * Constructor is a special method whose name is same as the class name.
 * Constructor doesn't have any explicit return type. Every Constructor will return reference(memory location) 
 * of the object
 * 
 * Constructor is used to create an instance of the class. We have two types of constructors
 * Default constructor
 * 	It will assign default values based on the data type of the instance variables
 * 
 * Parameterized constructor
 *  It will assign user defined values to the instance variables at the time of object creation 
 *  
 *  we can create n number of parameterized constructors either by changing the number of parameters, type 
 *  of parameters or sequence of parameters, this is known as constructor overloading
 *  
 * Java provides "this" keyword. "this" keyword always represents the current class instance.
 * which will differentiate instance variables with local variables.
 * We can use "this" keyword to call the constructor inside another constructor,
 * calling a constructor inside another constructor is the first line of code. This concept is known as
 * constructor chaining 
 * 
 */
public class ConstructorsDemo {
	String  name;
	int id;
	double balance;
	
	public ConstructorsDemo() {
		this.name = "prakash";
		this.id = 100;
		this.balance = 1000.00;
	}
	
	public ConstructorsDemo(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	//by changing number of arguments
	public ConstructorsDemo(String name, int id, double balance) {
		this(name, id);
		this.balance = balance;
	}
	
	//by changing the type of arguments
	public ConstructorsDemo(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	//by changing sequence of arguments
	public ConstructorsDemo(int id, String name) {
		this(name,id);
	}
	
	public static void main(String[] args) {
		ConstructorsDemo o1 = new ConstructorsDemo();
		o1.name = "vidya";
		o1.id = 101;
		System.out.println("name = "+o1.name+"\nid = "+o1.id+"\nbalance = "+o1.balance);
		ConstructorsDemo o2 = new ConstructorsDemo("tejaswi", 102);
//		o2.name = "tejaswi";
//		o2.id = 102;
		System.out.println("name = "+o2.name+"\nid = "+o2.id+"\nbalance = "+o2.balance);
		
		ConstructorsDemo o3 = new ConstructorsDemo("tejaswi", 1000.00);
		
		ConstructorsDemo o4 = new ConstructorsDemo(102, "tejaswi");
		
		Scanner s = new Scanner(System.in, "adafda");
	}

}
