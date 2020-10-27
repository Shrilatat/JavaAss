
public class Array_sub {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		int arr1[] = new int[arr.length];
		int i = 2;
		int j = 4;
		
		if(j>arr.length)
			System.out.println("Incorrect input");
		else {
			for(int c = i; c<=j; c++)
			{
				arr1[c] = arr[c];
				System.out.println(arr1[c]);
			}
		}
	}
}
