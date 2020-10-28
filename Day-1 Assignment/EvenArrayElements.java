
public class EvenArrayElements {
	void evenElements(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		EvenArrayElements e = new EvenArrayElements();
		int[] arr = {1,2,3,5,6};
		e.evenElements(arr);
	}
}
