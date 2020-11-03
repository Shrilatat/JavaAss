
public class SubArray {

	public static void subArray(int a[], int start, int end) {
        int arr2[] = new int[end-start+1], j=0; 
		
		for(int i=start; i <= end ; i++) {
			arr2[j++] = a[i];
		}

		System.out.println("\nArray2 elements are : ");
		for(int i : arr2) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		int arr1[] = {1, 5, 7, 9, 11, 35, 68, 29}, size = arr1.length;
		
		System.out.println("Array1 elements are : ");
		for(int i : arr1) {
			System.out.print(i + " ");
		}

		subArray(arr1, 2, 5);
	}

}
