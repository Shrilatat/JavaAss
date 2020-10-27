
import java.util.*;

public class StringAss {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int len;
		len = s.length();
		System.out.println(len);
		
		String r = s.toUpperCase();
		System.out.println(r);
		
		boolean flag=true;
		
		for(int i=0;i<(int)len/2;i++) {
			if(s.charAt(i)!=s.charAt(len-1-i)) {
				flag=false;
				break;
						
			}
		}
		if(flag==false) {
			System.out.println("Not Palindrome");
		}
		else {
			System.out.println("Palindronme");
		}
		scan.close();
	}
}
