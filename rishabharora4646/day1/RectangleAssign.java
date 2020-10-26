
public class RectangleAssign {
	private int length,breadth,perimeter,area;

	public RectangleAssign(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public RectangleAssign() {
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
	
	public void calcArea() {
		this.area = this.length * this.breadth;
	}
	
	public void calcPerimeter() {
		this.perimeter = 2*(this.length + this.breadth);
	}

	public String toString() {
		return "RectangleAssign [length=" + length + ", breadth=" + breadth + ", perimeter=" + perimeter + ", area="
				+ area + "]";
	}
		
}
