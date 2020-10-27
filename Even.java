
public class Even {
	
	public static void evenElements(int arr[]) {
		for(int i : arr) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main (String[] args) {
		int[] arr = {12, 5, 9, 16, 56, 87, 123, 194, 47, 72};
		evenElements(arr);
	}
}
