package demo.sts.day1;
import java.util.Scanner;


public class testRectangle {
	public static void main(String[] args) {
		Rectangle[] rectArray = new Rectangle[5];

		Scanner input = new Scanner(System.in);
		for (int i=0;i<5;i++) {
			System.out.println("Enter Rectangle " + (i+1) + " Dimensions:");
			rectArray[i] = new Rectangle();
			rectArray[i].inputDimensions(input);
		}
		input.close();
		int j=0;
		while(j<5) {
			System.out.println(rectArray[j++]);
		}
	}
}
