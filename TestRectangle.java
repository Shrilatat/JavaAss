public class TestRectangle {
	
	public static void main(String[] args) {
		Rectangle[] b1 = {new Rectangle(10,20), new Rectangle(30,20), new Rectangle(30,40), new Rectangle(40,50), new Rectangle(50,60)};
		for(Rectangle a : b1)
			System.out.println(a);
	}
}