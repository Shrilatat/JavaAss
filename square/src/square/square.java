package square;

import java.util.Scanner;
public class square {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of String array");
		int length = sc.nextInt();
		System.out.println(length);
	int a []=new int [length];
	int sq[]=new int [length];
	for (int i=0;i<length;i++)
	{
		a[i]=sc.nextInt();
		sq[i]=a[i]*a[i];
		
	}
	for(int i=0;i<length;i++)
	{
		System.out.println(sq[i]);
	}
}
}

