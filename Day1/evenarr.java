
public class evenarr {
	
	public void evenElements(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			if (arr[i]%2==0){
				System.out.println(arr[i]);				
			}
		}
	}

	public static void main(String[] args) {
		evenarr a = new evenarr();
		int[] arr={1,2,3,4,5,6,7,8};	
		a.evenElements(arr);
		
	}
}
