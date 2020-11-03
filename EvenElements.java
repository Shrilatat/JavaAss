
public class EvenElements {
	
	public static void evenElements(int a[],int size) {
		
		for(int i : a) {
			
			if(i%2 == 0) {
				System.out.print(i + " ");
			}
			
			else {
				continue;
			}
		}
	}

	public static void main(String[] args) {
        int arr1[] = {1, 5, 72, 9, 11, 35, 68, 290}, size = arr1.length;
		
        System.out.println("Even elements of array are : ");
        evenElements(arr1, size);
	}

}
