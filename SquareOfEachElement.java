
public class SquareOfEachElement {
	
	public static void main(String[] args) {
		
		int arr1[] = {1, 5, 7, 9, 11, 35, 68, 29};
		int arr2[] = new int[arr1.length]; 
		
		for(int i=0; i < arr1.length; i++) {
			arr2[i] = arr1[i]*arr1[i];
		}
		
		System.out.println("Array2 elements are : ");
		for(int i : arr2) {
			System.out.print(i + " ");
		}
	}
}
