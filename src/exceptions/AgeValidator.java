package exceptions;

public class AgeValidator {
	public static boolean validateAge(int age) throws InvalidAgeException {
		if(age>18) {
			return true;
		}else {
			throw new InvalidAgeException();
		}
	}

}
