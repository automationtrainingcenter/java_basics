package basicconcepts;

public class StaticVariableDemo {
	int i = 0; //instance 
	static int j = 0; // static
	
	public void increment() {
		i++;
		j++;
		System.out.println("i = "+i+"\nj = "+j);
	}
	
	public static void main(String[] args) {
		StaticVariableDemo obj1 = new StaticVariableDemo();
		obj1.increment(); //i =1 and j = 1
		obj1.increment(); //i =2 and j = 2 
		StaticVariableDemo obj2 = new StaticVariableDemo();
 		obj2.increment(); //i = 1 and j = 3
 		StaticVariableDemo obj3 = new StaticVariableDemo();
 		obj3.increment(); //i = 1 and  j = 4
 		obj3.increment(); //i = 2 and j = 5
	}

}
