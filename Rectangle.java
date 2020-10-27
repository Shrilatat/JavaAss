import java.lang.reflect.Array;

public class Rectangle {
	private int l, b;


	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

	public int area(){
		int a = l*b;
		return a;
	}
	
	public int perimeter() {
		int p = 2*(l+b);
		return p;
	}
	
	
	public String toString() {
		return "Rectangle [l=" + l + ", b=" + b + ", area()=" + area() + ", perimeter()=" + perimeter() + "]";
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(10, 30);
		Rectangle r3 = new Rectangle(10, 40);
		Rectangle r4 = new Rectangle(30, 20);
		Rectangle r5 = new Rectangle(20, 20);
		
		Rectangle arr[] = {r1, r2, r3, r4, r5};
		
		for( int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	
    }

      
}
