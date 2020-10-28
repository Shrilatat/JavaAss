import java.util.Scanner;

public class palindrome{
public static void main(String[] args) {
	System.out.println("Enter a String");
	Scanner s = new Scanner(System.in);
	String str=s.next();
	System.out.println("Length of the string is "+str.length());
	str=str.toUpperCase();
	char[] chars=str.toCharArray();
	char flag='t';
	for(int i=0;i<str.length()/2;i++) {
		if(chars[i]!=chars[str.length()-1-i])
			{
			System.out.println("The string is not a palindrome");
			flag='f';
			break;
			}
		flag='t';
	}
	if(flag=='t')
		System.out.println("The string is a palindrome");
}
}
