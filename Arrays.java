
public class Arrays {
public static void main(String[] args) {
	
	
	
}

public static void sum() {
	int[] arr = {1,2,3,4,5};
	int sum=0;
	for(int i:arr) {
		sum+=i;
	}
	System.out.println("sum "+sum+"avg"+sum/arr.length);
	
	
}
public static void square() {
	int[] arr= {1,2,3,4,5};
	int[] arr2 =new int[5];
	int sum=0;
	for(int i:arr) {
		System.out.println("square"+i*i);
		arr2[i-1]=i;

	}
	
}
public static int[] subArr(int start,int end) {
	int[] arr= {1,2,3,4,5};
	int[] arr2 = new int[end-start+1];
	
	for (int i = start; i < end; i++) {
		arr2[i]=arr[i];
	}
	
	return arr2;
	
}

public static void even(int[] arr) {
	for(int i:arr) {
		if(i%2==0)
			System.err.println(i);
	}
	
}



}
