
public class ArraysAssign2and3 {
	
	public static int[] subArr(int arr[], int start, int end) {
		if (start >=0 && end <arr.length) {
			int[] arr_sub = new int[end - start + 1];
			int j= 0;
			for (int i=start;i<=end;i++) {
				arr_sub[j] = arr[i];
				j++;
			}
			return arr_sub;
		} else {
			return arr;
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
			arr2[i] = arr1[i] * arr1[i];
		}
		for(int i : arr2) {
			System.out.println(i);
		}
		
		//sub array call arrayassign_3
		int arr3[] = subArr(arr2, 1, 3);
		for(int i : arr3) {
			System.out.println(i);
		}		
	}
}
