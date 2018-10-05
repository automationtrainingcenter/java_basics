package basicconcepts;

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
