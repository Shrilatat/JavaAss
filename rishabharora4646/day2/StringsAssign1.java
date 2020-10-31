import java.util.Scanner;

public class StringsAssign1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String s1 = sc.next();
		
		System.out.println("Length:"+ s1.length());
		System.out.println("Uppercase:"+ s1.toUpperCase());
	    int length = s1.length();
	    int forward = 0;
	    int backward = length - 1;
	    boolean state=true;
	    while (backward > forward) {
	    	char forwardChar = s1.charAt(forward++);
	    	char backwardChar = s1.charAt(backward--);
	    	if (forwardChar != backwardChar) {
	    		state = false;
	    	}
	    }
	    if (state) {
	    	System.err.println("Palindrome");
	    } else {
	    	System.out.println("Not Palindrome");
	    }
		
	}
}
