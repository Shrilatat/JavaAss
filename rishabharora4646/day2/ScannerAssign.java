import java.util.Scanner;

public class ScannerAssign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 digit number");
		int number = sc.nextInt();
		int[] arr = new int[5];
		int i = 0;
		while (number > 0) {
			if (i > 4)
				break;
		    arr[i] = number % 10;
		    i = i +1;
		    number = number / 10;
		}
		
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		
	}
}
