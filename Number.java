
public class Number {
	public static void Function(int n) {
		int sum=0;
		while(n>0){
			sum=sum+n%10;
			System.out.print(n%10 + " ");
			n=n/10;
		}
		System.out.println();
		System.out.println("Sum of the digits: " + sum);
	}
	public static void main(String[] args) {
		int n=426830;
		Function(n);
	}
}
