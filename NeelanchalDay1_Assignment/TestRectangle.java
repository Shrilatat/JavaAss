
public class TestRectangle {
	
	public static void main(String[] args) {
		
		Rectangle a1 = new Rectangle(10,20);
		Rectangle a2 = new Rectangle();
		Rectangle a3 = new Rectangle(20,30);
		Rectangle a4 = new Rectangle(40,50);
		Rectangle a5 = new Rectangle(60,70);
		
		System.out.println(a1.toString() + " - data for a1 " );
		
		System.out.println(a2.toString() + " - data for a2 " );
		
		System.out.println(a3.toString() + " - data for a3 " );
		
		System.out.println(a4.toString() + " - data for a4 " );
		
		System.out.println(a5.toString() + " - data for a5 " );
		
		a2.setBreadth(23);
		a2.setLength(33);
		System.out.println(a2.toString() + " - data for a2 " );
		
		System.out.println(a3.getLength()+" is length of a3  ");
		
		System.out.println(a4.getBreadth() + " is breadth of a4 " );
	}

}
