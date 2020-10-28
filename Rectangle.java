
public class Rectangle {
	private int length, breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public static int perimeter(int length, int breadth) {
		return (2 * (length + breadth));
	}
	
	public static int area(int length, int breadth) {
		return (length*breadth);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", perimeter=" + perimeter(length,breadth) + ", area= "+ area(length,breadth) + "]";
	}

}
