
public class ArraysAssign4 {
	
	public static void evenElements(int arr[]) {
		for (int i : arr) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		evenElements(arr1);
	}
}
