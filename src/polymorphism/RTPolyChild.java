package polymorphism;

public class RTPolyChild extends RTPolyParent{
	
	@Override
	public void add(String a, String b) {
		System.out.println("child add method");
		int ia = Integer.parseInt(a);
		int ib = Integer.parseInt(b);
		System.out.println(ia + ib);
	}
}
