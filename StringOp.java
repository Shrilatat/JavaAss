import java.util.Scanner;

public class StringOp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter something: ");
		String s = sc.nextLine();
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		
		String reverse = "";
		for(int i = s.length()-1; i>=0; i--) {
			reverse = reverse + s.charAt(i);
		}
		
		if(s.toUpperCase().equals(reverse.toUpperCase())) {
			System.out.println("It's a palindrome!");
		}else {
			System.out.println("It's not a palindrome!");
		}
	}
}
