//import java.util.Arrays;

public class Array {
	
	int[] arr = new int[] {1,2,3,4,5};
	
	 int len = arr.length;
	 
	 
	
	public int[] subArr(int start,int end,int[] brr) 
	 {
		 
		 int size = end-start+1;
		 int crr[] = new int[size];
		 for(int i=0;i<size;i++)
		 {
			 crr[i]=brr[start+i];
		 }
		 return crr;
	 }
	
	
	public void evenElements(int[] arr)
	{	
		for(int i : arr)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
	
	
}