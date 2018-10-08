package basicconcepts;
/*
* In java we have mainly two types of data types
* 1. primitive
* 		boolean either true or false - Boolean
* 		char which will store single character - Character
*		byte store integer values - Byte
*		short store integer values - Short
*		int store integer values -Integer
*		long store integer values - Long
*		float store floating point number -Float
*		double store floating point number - Double
* 	
* 2. reference
* 		Arrays
* 		Strings
* 
*  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
* are known as Wrapper classes. These are used to perform different operations on data.
* 		1. Boolean
* 		2. Character
* 		3. Byte
* 		4. Short
* 		5. Integer
* 		6. Long
* 		7. Float
* 		8. Double
* 
* 	WCData_type obj_name = new WCData_type(value);
* 
* 	Type Casting: converting one type of data to another type of data
* 	up casting: lower memory type to higher memory type : widening : no data loss
* 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
* 
* 	Converting primitive data type to wrapper class: boxing
*  Converting wrapper to primitive : un-boxing
* 
* 
* syntax to create primitive data type
* data-type var-name  = value; //initialization
* data-type var-name; //declaration
* var-name = value; //assignment to the variable which is already declared
* 
* variable is nothing but name of memory location where we are storing data
*/

public class DataTypesDemo {
	
	public static void main(String[] args) {
		//boolean
		boolean b = true;
		System.out.println("boolean value is "+b);
		
		//character
		char ch = '@';
		System.out.println("character value is "+ch);
		System.out.println("character occupies "+Character.BYTES);
		System.out.println("min value of character type is : "+Character.MIN_VALUE);
		System.out.println("max value of character tyep is: "+Character.MAX_VALUE);
//		Character obj = new Character('c');
		
		//byte
		byte by = 120;
		System.out.println("byte value is "+by);
		System.out.println("byte occupies "+Byte.BYTES);
		System.out.println("min value of byte tyep is : "+Byte.MIN_VALUE);
		System.out.println("max value of byte tyep is : "+Byte.MAX_VALUE);
		
		//short
		short sh = 1234;
		System.out.println("short value is "+sh);
		System.out.println("short occupies "+Short.BYTES);
		System.out.println("min value of short type is: "+Short.MIN_VALUE);
		System.out.println("max value of short type is: "+Short.MAX_VALUE);
		
		//int
		int i = 123456;
		System.out.println("int value is "+i);
		System.out.println("int occupies "+Integer.BYTES);
		System.out.println("min value of int type is: "+Integer.MIN_VALUE);
		System.out.println("max value of int type is: "+Integer.MAX_VALUE);
		
		//long
		long l = 123456789l;
		System.out.println("long value is "+l);
		System.out.println("long occupies "+Long.BYTES);
		System.out.println("min value of long type is: "+Long.MIN_VALUE);
		System.out.println("max value of long type is: "+Long.MAX_VALUE);
		
		//float
		float f = 123.43f;
		System.out.println("float value is "+f);
		System.out.println("float occupies "+Float.BYTES);
		System.out.println("min value of float type is: "+Float.MIN_VALUE);
		System.out.println("max value of float type is: "+Float.MAX_VALUE);
		
		//double
		double d = 123.345;
		System.out.println("double value is "+d);
		System.out.println("double occupies "+Double.BYTES);
		System.out.println("min value of double type is: "+Double.MIN_VALUE);
		System.out.println("max value of double type is: "+Double.MAX_VALUE);
		
		//upcasting
		//upper_data_tyep_var_name = lower_data_type_var_name
		byte bt = 120;
		int in;
		in = bt;
		System.out.println("int value is "+in);
		
		//downcasting
		//lower_data_type_var_name = (lower_data_type) upper_data_tyep_var_name;
		short st = 456;
		byte be;
		be =(byte) st;
		System.out.println("byte value is "+be);
		//type conversion
		float ft = 123.456f;
		int inf;
 		inf = (int)ft;
 		System.out.println(inf);
 		
 		 //boxing
 		Integer iObj = new Integer(i);
 		Integer iObj1 = Integer.valueOf(i);
		System.out.println(iObj1);
		
		//unboxing
		Float fObj = new Float(54.45);
		float fP = fObj.floatValue();
		System.out.println(fP);
		
		//primitive to reference(String)
		System.out.println(i+10); // i =123456 => 123466
		String iS = String.valueOf(i);
		System.out.println(iS+10);//12345610
		
		
		//String to primitive
		String str = "123.45";
		System.out.println(str+10); //123.4510
		float fStr = Float.parseFloat(str);
		System.out.println(fStr+10);// 133.45
//		Integer.parseInt(s)
//		Double.parseDouble(s)
//		Short.parseShort(s)
	}
	

}
