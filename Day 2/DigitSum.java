import java.util.Scanner;

public class DigitSum {
public static void main(String[] args) {
	
	System.out.println("Enter a 5 digit no.");
	
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	
	int sum = 0;
	String rev = "";
	while(n>0)
	{
		rev = rev + n%10 +" ";
		sum+=n%10;
		n=n/10;
	}
	
	System.out.println(rev);
	System.out.println("Sum of digits= "+sum);
	
	
}
}
