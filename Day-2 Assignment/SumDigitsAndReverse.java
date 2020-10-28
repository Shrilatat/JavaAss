import java.util.Scanner;

public class SumDigitsAndReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 5 digit number");
		String num = sc.next();
		int sum=0;
		String rnum="";
		for(int i=0; i<num.length();i++) {
			sum+=Integer.parseInt(String.valueOf(num.charAt(i)));
			rnum=String.valueOf(num.charAt(i))+" "+rnum;
		}
		System.out.println("Sum is: "+sum+" Reverse number is: "+rnum);
	}
}
