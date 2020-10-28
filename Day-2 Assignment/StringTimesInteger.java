import java.util.Scanner;

public class StringTimesInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String");
		String s = sc.next();
		System.out.println("Input number for times the string to be displayed");
		int times = sc.nextInt();
		int x=0;
		while(x<times) {
			System.out.println(s);
			x+=1;
		}
	}
}
