package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * In java we have two types of exceptions
 * 1. compile time exceptions (checked exceptions)
 * 2. run time exceptions (unchecked exceptions)
 * we will handle both these exceptions using try, catch and finally blacks
 * try: we are going to statements which will throw exceptions
 * catch: statements to handle the exception
 * finally: either exception occurred or not, statements inside finally block will execute
 * 
 * try block always follows with either catch block or finally block
 * catch block takes exception class as an argument
 */

public class ExceptionsDemo {
	public static void main(String[] args) {
		
		
		System.out.println("statement before exception");
		int a = 10;
		
		try {
			System.out.println(a / 10);
			System.out.println(a - Integer.parseInt("2"));
//			compile time exception
			FileInputStream fis = new FileInputStream(".//credentials.properties");
			boolean result = AgeValidator.validateAge(12);
		} catch (ArithmeticException e) {
			System.out.println("it is not possible to divide a number by zero");
		} catch(NumberFormatException e) {
			System.out.println("can not convert a character to integer");
		} catch(FileNotFoundException e) {
			System.out.println("the file you mentioned is not available in the path");
		}
		catch(InvalidAgeException e) {
			System.out.println("age must be greater than 18");
		}catch(Exception e) {
			System.out.println("exception "+e.getClass().getSimpleName() +" occurred "+e.getMessage());
		}
		finally {
			System.out.println("this is finally block, it will execute every time");
		}
		System.out.println("statement after exception");

	}

}
