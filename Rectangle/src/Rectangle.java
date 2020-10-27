
public class Rectangle {
	private double length;
	private double width;
	private double pt;
	private double ar;
	
	public Rectangle() {
		length=0.0;
		width=0.0;
	}
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	public void calpt() {
		pt=2*(length+width);
	}
	public void calar() {
		ar=length*width;
	}
	public double getl() {
		return length;
	}
	public double getw() {
		return width;
	}
	public double getpt() {
		return pt;
	}
	public double getar() {
		return ar;
	}
	
}
