package demo.sts.day1;

import java.util.Scanner;

public class IntArrayDemo {
	private static int arrLength = 5;
	private static int[] intArray = new int[arrLength];
	private static int[] sqArray = new int[arrLength];
	
	private static void scanElements() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter " + arrLength + " Integers(return after each input): ");
		for (int i=0;i<arrLength;i++)
			intArray[i] = input.nextInt();
		input.close();
	}
	
	private static int sumElements() {
		int sum = 0;
		for(int i : intArray)
			sum += i;
		return sum;
	}
	
	private static float avgElements() {
		return sumElements()/intArray.length;
	}
	
	private static int[] squareElements() {
		for (int i=0;i<intArray.length;i++)
			sqArray[i] = intArray[i]^2;
		return sqArray;
	}
	
	private static int[] subArr(int startIndex, int endIndex) {
		int[] subArray = new int[endIndex-startIndex];
		for (int i=0;i<subArray.length;i++)
			subArray[i] = intArray[startIndex+i];
		return subArray;
	}
	
	private static int[] evenElements() {
		int[] evenArray;
		int i=0, j=0, evenCount=0;
		
		while (i<intArray.length)
			if (intArray[i++]%2 == 0)
				evenCount++;
		evenArray = new int[evenCount];
		i=0;
		while(i<intArray.length)
			if (intArray[i++]%2 == 0)
				evenArray[j++] = intArray[i-1];
		return evenArray;
	}
	
	public static void main(String[] args) {
		scanElements();
		System.out.println("Sum of Elements = " + sumElements());
		System.out.println("Avg of Elements = " + avgElements());
		System.out.print("Square of Elements = ");
		for (int i : squareElements())
			System.out.print(i + " ");
		System.out.print("\nSubArray = ");
		for (int i : subArr(1, 4))
			System.out.print(i + " ");
		System.out.print("\nEven Elements = ");
		for (int i : evenElements())
			System.out.print(i + " ");
	}
}
