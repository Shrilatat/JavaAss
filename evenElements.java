
public class evenElements {

	public static int[] even(int[] arr) {
		int[] arr1 = new int[arr.length];
		for(int i = 0; i<arr.length; i++) {
			if(i%2==0)
				arr1[i] = arr[i];
		}
		return arr1;
	}

}
