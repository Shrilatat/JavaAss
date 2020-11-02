
public class Rect {
	private double length;
	private double breadth;
	
	
	public Rect(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public double calArea() {
		return (getLength()*getBreadth());
	}
	
	public double  calPeri() {
		return (2*(getLength()+getBreadth()));
	}
	public void displayAll() {
		System.out.println( "Area is " + calArea() + "Peri is "+calPeri() +"Length is "+getLength()+ "breadth is "+getBreadth() );
	}
	
	@Override
	public String toString() {
		return "Rect [length=" + length + ", breadth=" + breadth + "]";
	}


	public double getLength() {
		return length;
	}
	public void setLength(double len) {
		this.length = len;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	
	

}
