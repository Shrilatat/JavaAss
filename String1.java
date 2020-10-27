import java.util.Scanner;

public class String1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String dummy = sc.next();
		
		System.out.println("Length: "+ dummy.length() );
		System.out.println(dummy.toUpperCase());
		int len = dummy.length();
		String pal = new String();

		for (int i =0; i< len ; i++) {
			pal = pal + dummy.charAt(len-i-1);
		}
		
		if (dummy.equals(pal)) {
			System.out.println("Is a Pallindrome");
		}
		else {
			System.out.println("Not a Pallindrome");
		}
		
		
		
	}

}
