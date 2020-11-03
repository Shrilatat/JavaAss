
public class SumAndAverageOfElements {
	public static void main(String[] args) {
		int arr[] = {1, 5, 7, 9, 11, 35, 68, 29}, size, sum=0;
		size = arr.length;
		for(int i : arr) {
			sum += i;
		}
		double avg = (double)sum / (double)size;
		System.out.println("Sum of array is : " + sum);
		System.out.println("Average of array is : " + avg);
	}
	
	
}
