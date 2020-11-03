import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt(), sum = 0;
		
		sc.close();
		
		System.out.print("\nDigits of number in reverse order : ");
		while(num != 0) {
			int x = num % 10;
			System.out.print(x + " ");
			
			sum += x;
			
			num /= 10;
		}

		System.out.println("\nSum of the digits of number : " + sum);
	}

}
