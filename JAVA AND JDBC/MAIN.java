
public class MAIN {
	public static void main(String[] args) {
		PolymorphismExample s = new PolymorphismExample();
		s.display();
		s.display1();
		
		PolymorphismExample c = new SubClass();
		c.display1();
	}
}	
