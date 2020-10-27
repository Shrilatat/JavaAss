import java.util.Scanner;



public class Sumofdigits {
	
	public static void main(String[] args) {
		System.out.println("Enter Your 5 Digit Number : ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		int[] a = new int[5];
		for(int i=0;i<5;i++) {
			sum += n%10;
			a[i]=n%10;
			n/=10;
		}
		System.out.println(sum);
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		
	}

}
