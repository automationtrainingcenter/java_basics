package accessmodifiers;

/*
 * we have 4 access modifiers
 * public : any one access in Java world
 * private : we can access only with in the class 
 * default : can be accessed with in the package only
 * protected : same as default. But, outside the package child class objects can access protected modifiers
 */
public class AccessModifiersDemo {
	public int pVar = 1;
	private int prVar = 2;
	int dVar = 3;
	protected int proVar = 4;
	
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
		System.out.println(obj.prVar);
		System.out.println(obj.dVar);
		System.out.println(obj.proVar);
	}
	

}
