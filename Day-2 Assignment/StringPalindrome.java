import java.util.Scanner;

public class StringPalindrome {
	public boolean checkPalindrome(String s) {
		int i=0, j=s.length()-1;
		while(j>i) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}else {
				i++;
				j--;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		StringPalindrome sp = new StringPalindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your string");
		String s = sc.next();
		boolean result = sp.checkPalindrome(s);
		System.out.println("Length: "+s.length()+" Uppercase string: "+s.toUpperCase()+" Palindrome-"+result);
		
	}
}
