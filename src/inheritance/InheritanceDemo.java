package inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
//		ChildOne obj = new ChildOne();
//		obj.childOneMethod();
//		obj.parentMethod();

		// create an object of the GrandChild
//		GrandChild gobj = new GrandChild();
//		gobj.granchChildMethod();
//		gobj.childOneMethod();
//		gobj.parentMethod();
//		
		//create an object of Child Two
		ChildTwo c2Obj = new ChildTwo();
		c2Obj.childTwoMethod();
		c2Obj.parentMethod();
	}

}
