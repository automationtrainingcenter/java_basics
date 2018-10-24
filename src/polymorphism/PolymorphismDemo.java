package polymorphism;
/*
 * Polymorphism means one object will behave differently based on the input or the environment
 * Compile time polymorphism : method overloading single class is enough
 * run time polymorphism: method overriding, we required minimum two classes with parent and child relation
 * sometimes we require abstract classes or interfaces
 */
public class PolymorphismDemo {
	public static void main(String[] args) {
		CompileTimePolymorphism obj = new CompileTimePolymorphism();
		obj.methodOne("10", 20);
		obj.methodOne(10, 20);
		obj.methodOne(10, "20", 30);
		obj.methodOne(10,  "20");
		
		RTPolyParent pObj = new RTPolyParent();
		pObj.add("10", "20");
		
		RTPolyChild cObj = new RTPolyChild();
		cObj.add("10", "20");
		
		RTPolyParent pRef = new RTPolyChild();
		pRef.add("10", "20");
		
		
	}

}
