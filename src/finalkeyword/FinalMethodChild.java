package finalkeyword;

public class FinalMethodChild extends FinalMethodParent{
		@Override
		public void normalMethod() {
			System.out.println("normal method in child class");
		}
		
//		@Override
//		public final void finalMethod() {
//			
//		} // It gives compile time error

}
