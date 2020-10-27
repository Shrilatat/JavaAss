package javademo;

public class EvenElements {
   
	private int arr[] = new int[5];

	public EvenElements(int[] arr) {
		this.arr = arr;
	}
	
	public  void evenE(int[] arr)
	{
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]%2==0)
				System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int a[] = new int[5];
		
		for(int i=0 ; i<5 ; i++)
		{
			a[i]=i+1 ;
		}
		
		EvenElements b = new EvenElements(a);
		b.evenE(a);
		
	}
	
	
}
