package basicconcepts;
/* String is set of characters.
 * In Java Strings will be stored in a separate memory area known as String Constant Pool
 * Strings are immutable i.e. we can't change String values.
 * 
 *	//declare
 *	String obj_name = new String(string value);
 *	
 *	//string declaration using String literal
 *	String obj_name;
 *	
 *	//assign
 *	obj_name = "value";
 *	
 *	//retrieve
 *	using obj_name we can retrieve String data
 *
 *	//initialization
 *	String obj_name = "value";
 *
 * 	String class provides so many methods to manipulate string data
 */

public class StringsDemo {
	public static void main(String[] args) {
		String s1 = "vidya";
		String s2 = "tejaswi";
		String s3 = "vidya";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode()); //vidya
		s3 = "surya";
		System.out.println(s3.hashCode()); //surya
		
		String s4 = new String("prakash");
		String s5 = new String("prakash");
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		
	}
	

}
