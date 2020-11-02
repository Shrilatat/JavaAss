
public class Array {
	
	int[] array1 = {1,5,10,15,20};
	
	public int[] subArr(int start, int end, int[] arr1)
	{
		int size= end -start +1;
		int arr2[]= new int[size];
		for(int i=0;i<size;i++)
			arr2[i]=arr1[start+i];
		return arr2;
	}
	
	public void evenElements(int[] arr1)
	{
		for(int i : arr1)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Array arr= new Array();
		int sum=0;
		
		for(int i : arr.array1)
			sum+=i;
		
		float avg = (float)sum/arr.array1.length;
		
		System.out.println("sum="+sum+"  "+"average="+avg);
		
		int SquareArr[] = new int[5];
		
		System.out.println("Squares :");
		
		for(int i=0; i<arr.array1.length; i++) {
			SquareArr[i] = arr.array1[i]*arr.array1[i];
			System.out.println(SquareArr[i]);
		}
		
		int arr3[]= arr.subArr(1, 4, SquareArr);
		for(int i : arr3)
			System.out.println(i);
		
		arr.evenElements(SquareArr);
}
}
