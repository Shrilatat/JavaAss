
public class Shape {
	String color;

	
	public Shape(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}

	public static void main(String[] args)
	{
		Shape s1=new Shape("RED");
		
		System.out.println(s1.getcolor());
	}
}
