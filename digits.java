import java.util.Scanner;

public class digits {
	
	public static void main(String args[]) {
		System.out.println("enter a five digit number");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		String ans= new String();
		
		for (int i=1; i<=5; i++) {
				int x = N%10;
				sum +=x;
				ans =ans + x + " " ;
				N = N/10;
		}
		System.out.println("Sum of digits: " + sum);
		System.out.println(ans);
	}
	

}
