import java.util.Scanner;
public class Palindrome {
	public static boolean isPalindrome(String str) { 
		int i = 0, j = str.length() - 1; 
        while (i < j) { 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
            i++; 
            j--; 
        } 
        return true; 
    } 
  
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Input the String:");
		String name=obj.next();
		System.out.println("Length of the String: " + name.length());
		System.out.println("Uppercas e of String: " + name.toUpperCase());
		System.out.println("Input String is Palindrome: " + isPalindrome(name));
	}
}
