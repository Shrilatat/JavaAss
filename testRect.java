import java.util.Scanner;

public class testRect {

	public static void main(String[] args) {
		Rect[] rects = new Rect[5];
		Scanner scan = new Scanner(System.in);
		
		
		for(Rect rect:rects) {
			double len = scan.nextDouble();
			double bre = scan.nextDouble();
			rect.setLength(len);
			rect.setBreadth(bre);
			System.out.println("Area is "+rect.calArea()+"Peri is "+rect.calPeri());
		}
	}
}
