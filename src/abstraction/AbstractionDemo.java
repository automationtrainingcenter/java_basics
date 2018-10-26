package abstraction;
/*
 * In Java we can achieve abstraction in two ways
 * 1. Abstract classes (0 -100%)
 * 		A class with at least one abstract method is known as Abstract class.
 * Abstract method: a method without definition or body
 * A normal Java class will "extends" abstract class and provides definition to the abstract methods
 * 
 * 2. Interface (100%)
 * 		An interface contains abstract methods only
 * A normal Java class will "implements" interface and provides definition to the abstract methods
 * we can't create an object of abstract class or interface
 */

public class AbstractionDemo {
	
	public static void main(String[] args) {
		AbstractClass obj = new AbstractClassImpl();
		obj.methodOne();
		obj.methodTwo();
		obj.methodThree();
		
		
		InterfaceDemo iObj = new IterfaceImpl();
		iObj.methodOne();
		iObj.methodTwo();
	}

}
