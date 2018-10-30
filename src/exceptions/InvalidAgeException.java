package exceptions;

public class InvalidAgeException extends Exception{
	public InvalidAgeException() {
		super("Age must be greaterthan 18");
	}

}
