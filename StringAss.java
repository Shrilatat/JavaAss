import java.util.*;

public class StringAss {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		System.out.println(str.length());
		
		String newstr = str.toUpperCase();
		System.out.println(newstr);
		
		int j= 0;
		
		for(int i=0;i<(int)str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				j=1;
				break;
						
			}
		}
		if(j==1) {
			System.out.println("Not Palindrome");
		}
		else {
			System.out.println("Palindronme");
		}
		scan.close();
	}
	}