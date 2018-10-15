package inheritance;

public class ChildOne extends Parent {
	
	public ChildOne() {
		//parent class constructor call
		super();
		System.out.println("child object created");
	}

	public void childOneMethod() {
		System.out.println("child one method");
	}

}
