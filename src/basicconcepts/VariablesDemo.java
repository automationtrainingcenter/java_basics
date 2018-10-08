package basicconcepts;

/*
 * Variable is name of memory location where we store data. 
 *
 * if we want to make any variable as constant then use "final" keyword.
 * 
 * Types of variables
 * 
 * 1.Instance variables 
 * 		It is a variable which is declared inside the class but outside of any method. 
 * These are object level. We can access these variables directly inside the class 
 * instance methods and by creating an object of the class in same class static methods 
 * and outside the class. 
 * Variable declaration
 * 		access_modifier data_type var_name; 
 * accessing variable 
 * 		object_name.var_name = value; 
 * Initialization variable: At the time of variable declaration we are going to assign some value 
 * 		access_modifier data_type var_name = value;
 * 
 * 2.static variables 
 * 		It is a variable which declared inside the class and outside of any method 
 * but declared using 'static' keyword. These are class level i.e. object to object these 
 * variables will share the information. We can access these variables directly inside the 
 * class and by using class_name outside the class.
 * Variable declaration 
 * 		access_modifier static data_type var_name; 
 * accessing variable 
 * 		class_name.var_name = value; 
 * Initialization
 * 		access_modifier static data_type var_name = value;
 * 
 * 3.local variables 
 * 		It is variable which is declared inside any method. we can
 * access this variable inside the method only. 
 * Variable declaration 
 * 		data_type var_name; 
 * accessing variable 
 * 		var_name = value; 
 * Initialization 
 * data_type var_name = value;
 * 
 */
public class VariablesDemo {

	// instance variable
	int i;
	String name;

	// static variable
	static String collegeName;
	
	//instance method which will print student details
	public void printStudentDetails() {
		System.out.println("id = " + i + "\nname = " + name + "\ncollege name = " + VariablesDemo.collegeName);
	}

	public static void main(String[] args) {
		// local variable
		int a = 10;

		VariablesDemo s1 = new VariablesDemo();
		s1.i = 100;
		s1.name = "vidya";

		VariablesDemo s2 = new VariablesDemo();
		s2.i = 101;
		s2.name = "tejaswi";

		VariablesDemo.collegeName = "JNTU";

		System.out.println("local variable a = " + a);

		// printing student 1 info
		System.out.println("Student one details are");
//		System.out.println("id = " + s1.i + "\nname = " + s1.name + "\ncollege name = " + VariablesDemo.collegeName);
		s1.printStudentDetails();
		
		// printing student 2 info
		System.out.println("Student two details are");
//		System.out.println("id = " + s2.i + "\nname = " + s2.name + "\ncollege name = " + VariablesDemo.collegeName);
		s2.printStudentDetails();
	}

}
