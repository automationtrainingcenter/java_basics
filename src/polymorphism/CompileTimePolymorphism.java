package polymorphism;

public class CompileTimePolymorphism {
	
	public void methodOne(int a, String b) {
		System.out.println(a+b);
	}
	
	//change in type of arguments
	public void methodOne(int a, int b) {
		System.out.println(a+b);
	}
	
	//change in number of parameters
	public void methodOne(int a,  String b, int c) {
		int d = a+c;
		System.out.println(d+b);
	}
	
	//change in sequence of arguments
	public void methodOne(String a, int b) {
		System.out.println(a+b);
	}
	
	
	//By simply changing the return type of a method we can't achieve method overloading
//	public int methodOne(int a, String b) {
//		
//	}
	
	

}
