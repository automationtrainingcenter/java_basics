package basicconcepts;

import accessmodifiers.AccessModifiersDemo;

public class ProtectedDemo extends AccessModifiersDemo{
	
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
//		System.out.println(obj.prVar);
//		System.out.println(obj.dVar);
//		System.out.println(obj.proVar);
		
		ProtectedDemo cObj = new ProtectedDemo();
		System.out.println(cObj.pVar);
		System.out.println(cObj.proVar);
//		System.out.println(cObj.prVar);
//		System.out.println(cObj.dVar);
	}

}
