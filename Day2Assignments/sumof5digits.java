import java.util.Scanner;

public class sumof5digits {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the num");
		int num= s.nextInt();
		int sum=0;
		String str="";
		for(int i=1;i<5;i++) {
			sum+=num%10;
			str=str+num%10+" ";
			num/=10;
		}
		sum+=num%10;
		str=str+num%10;
		System.out.println("The sum of digits is "+sum);
		System.out.println("The reverse num is "+str);
	}
}
