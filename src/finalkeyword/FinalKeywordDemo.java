package finalkeyword;
/*
 * We can declare a variable, method or class as final.
 * 		If we declare a variable as final we can't change that variable value. i.e. that variable 
 * is a constant.
 * 
 * 		If we declare a method as final in parent class we can't override that method definition in it's 
 * child classes
 * 
 * 		If we declare a class as final we can't create child classes to that class.
 */
public class FinalKeywordDemo {
	
	public static void main(String[] args) {
		FinalMethodParent obj = new FinalMethodChild();
		obj.normalMethod();
		obj.finalMethod();
	}

}
