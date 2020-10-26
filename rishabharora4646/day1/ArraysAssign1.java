
public class ArraysAssign1 {
	
	public static void main(String[] args) {
		int arr1[] = {20,30,40,50,60};
		int sum = 0;
		for (int i : arr1) {
			sum += i;
		}
		int avg = sum/arr1.length;
		System.out.println("Sum is : "+sum+ "\nAvg : "+avg);
		
	}
}
