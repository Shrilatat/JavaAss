
public class Arrays {
	
	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	public static void squareOfNumbers(int[] arr) {
		int[] array2 = new int[arr.length];
		for(int i =0; i<arr.length; i++) {
			array2[i] = arr[i]*arr[i];
		}
		for(int i : array2) {
			System.out.println(i);
		}
	}
	
	public static int[] subArr(int[] arr, int start, int end) {
		if(start<=end && start>=0 && start<5 && end>=0 && end<5) {
			int len = end - start +1;
			int[] array3 = new int[len];
			int j=0;
			for(int i = start; i<= end; i++) {
				array3[j] = arr[i];
				j++;
			}
			return array3;
		}else {
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		int[] array1 = {24, 56, 7, 11, 93};
		
		//Sum and Average of elements in array
		int sum = sumOfArray(array1);
		float average = ((float)sum) / array1.length ; 
		System.out.println("Sum=" + sum + ", Average=" + average);	
		
		//Squared numbers in array
		squareOfNumbers(array1);
		
		//Subarray between two indexes
		subArr(array1, 1, 3);
	}
}
