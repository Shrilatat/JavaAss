import java.util.Scanner;

public class digit {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number");

		String str = s.next();

		int n = Integer.parseInt(str);

		int sum = 0;

		String s1 = "";

		while (n > 0) {
			sum += n % 10;

			s1 = s1 + n % 10 + " ";

			n = n / 10;
		}

		System.out.println("sum is " + sum);

		System.out.println("Reverse of digit is " + s1);
	}

}
