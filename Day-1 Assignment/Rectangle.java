
public class Rectangle {
	private int length, breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public void recInfo() {
		int area=length*breadth;
		int peri = 2*(length+breadth);
		System.out.println("Dimensions: "+ length + " "+breadth + ",Area: "+area+" Perimeter: "+peri);
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2,4);
		r1.recInfo();
		Rectangle r2 = new Rectangle(4,2);
		r2.recInfo();
		Rectangle r3 = new Rectangle(20,40);
		r3.recInfo();
		Rectangle[] Rec = {r1,r2,r3}; 
		System.out.println(Rec);
	}
}
