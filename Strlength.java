import java.util.Scanner;

public class Strlength {
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter Your String : ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int len = str.length();
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		int mark = 1;
		for(int i=0 ; i < (len+1)/2 ;i++) {
			if(str.charAt(i)==str.charAt(len-1-i)) {
				continue;
			}
			else {
				mark=0;
				System.out.println("String is not a palindrome");
				break;
			}
		}
		if(mark==1) {
			System.out.println("String is a palindrome");
		}
		
		
	}
	
	
	

}
