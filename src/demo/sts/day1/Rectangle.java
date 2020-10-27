package demo.sts.day1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {
	private float length, breadth;

	public Rectangle() {
		this.length = 0.0f;
		this.breadth = 0.0f;
	}
	
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		if (length<0) {
			this.length = 0.0f;
		}
		else {
			this.length = length;
		}
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		if (breadth<0) {
			this.breadth = 0.0f;
		}
		else {
			this.breadth = breadth;
		}
	}
	
	public float calcArea() {
		return length*breadth;
	}
	
	public float calcPerimeter() {
		return 2*(length+breadth);
	}

	public void inputDimensions(Scanner input) {
		float len = -1.0f;
		while(len<0) {
			System.out.println("Length: ");
	        try {
	            len = input.nextFloat();
	        } catch (InputMismatchException ime) {
	            System.out.println("Input Mismatch! Can not be parsed as a float value. Try Again");
	            input.next(); // Flush the buffer from all data
	            len = -1.0f;
	        }
		}
		float brth = -1.0f;
		while(brth<0) {
			System.out.println("Breadth: ");
	        try {
	        	brth = input.nextFloat();
	        } catch (InputMismatchException ime) {
	            System.out.println("Input Mismatch! Can not be parsed as a float value. Try Again");
	            input.next(); // Flush the buffer from all data
	            brth = -1.0f;
	        }
		}
		setLength(len);
		setBreadth(brth);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", Area=" + calcArea()
				+ ", Perimeter=" + calcPerimeter() + "]";
	}
}
