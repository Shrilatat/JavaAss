package demo.sts.day1;

import java.util.Scanner;

public class IntArrayDemo {
	private static int arrLength = 5;
	private static int[] intArray = new int[arrLength];
	private static int[] sqArray = new int[arrLength];
	
	private static void scanElements() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + arrLength + " Integers(\r after each input): ");
		for (int i=0;i<arrLength;i++)
			intArray[i] = input.nextInt();
		input.close();
	}
	
	private int sumElements() {
		int sum = 0;
		for(int i : intArray)
			sum += i;
		return sum;
	}
	
	private float avgElements() {
		return sumElements()/intArray.length;
	}
	
	private void squareElements() {
		for (int i=0;i<intArray.length;i++)
			sqArray[i] = intArray[i]^2;
	}
	
	private int[] subArr() {
		
	}
	
	public static void main(String[] args) {
		
	}
}
