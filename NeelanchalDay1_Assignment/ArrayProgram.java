
public class ArrayProgram {
	
	
	public static void main(String[] args) {
		
		Array a1 = new Array();
		int brr[] = new int[5];
		int sum = 0;
		for(int i : a1.arr)
		{
			sum+=i;
			
		}
		 float avg = sum/a1.len;
		System.out.println("sum of the array is "+ sum);
		System.out.println("Average of the array is " + avg);
		
		for(int i=0 ; i<brr.length;i++) 
		{
			brr[i]=a1.arr[i]*a1.arr[i];
			System.out.println(brr[i]);
		}
		System.out.println(" ");
		
		int trr[]=a1.subArr(1,3,brr);
		for(int i : trr)
			System.out.println(i);
		
		System.out.println(" ");
		
		a1.evenElements(brr);
	}
}
