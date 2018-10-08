package basicconcepts;

import java.util.Scanner;

/*If we want to read data from console Java provides Scanner class
 * In this Scanner class we have different methods to read different type of data
 * For each data type we have one method
 * 
 * Create an object of the Scanner class by passing System.in as an argument to Scanner class 
 * constructor
 */
public class ReadData {
	public static void main(String[] args) {
		// create an object of input class
		Scanner s = new Scanner(System.in);
		//boolean
		 
		//byte
		
		//short
		
		//integer
		System.out.println("please enter a number");
		int i = s.nextInt();
		
		//long
		
		
		//float
		System.out.println("please enter a floating point number");
		float f = s.nextFloat();
		
		//double
		
		//string
		System.out.println("Enter your name");
		String name = s.next();
		
		
		//character
		System.out.println("enter a character");
		char ch = s.next().charAt(0);
		
		System.out.println("number = "+i);
		System.out.println("floatin point number = "+f);
		System.out.println("name = "+name);
		System.out.println("character = "+ch);
	}

}
