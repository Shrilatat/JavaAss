
public class Rectangle {
	private int length, breadth;
	
	public Rectangle() {
		this.length=0;
		this.breadth=0;
	}
	
	public Rectangle(int length, int breadth) {
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

	public int CalArea() {
		return length*breadth;
	}
	
	public int CalPerimeter() {
		return 2*(length+breadth);
	}
	
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", Area=" + CalArea() + ", Perimeter="
				+ CalPerimeter() + "]";
	}
}
