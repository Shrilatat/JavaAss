import java.util.Scanner;

public class SumOfDigits {	
	private int number;
	
	public SumOfDigits(int number) {
		this.number = number;
	}
	
	public int sum() {
		int total = 0;
		while(number!=0) {
			System.out.println(number%10);
			total = total + number%10;
			number= number/10;
		}
		return total;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a 5-digit number: ");
		int num = sc.nextInt();
		
		SumOfDigits n = new SumOfDigits(num);
		System.out.println("Sum of digits: " + n.sum() );
		
		
	}
}
