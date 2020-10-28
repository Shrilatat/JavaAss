
public class SubArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int starti=2, stopi=5;
		int[] subArr = new int[stopi-starti+1];
		for(int i=starti; i<stopi+1;i++) {
			subArr[i-starti]=arr[i];
			System.out.print(subArr[i-starti]+" ");
		}
	}
}
