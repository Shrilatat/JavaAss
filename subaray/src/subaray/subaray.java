package subaray;

public class subaray {
	
	public static int[] a(int ar[],int s,int e)
	{
		int sub[]=new int [5];
		int j=0;
		for(int i=s;i<=e;i++)
		{
			sub[j]=ar[i];
			j++;
		}
		return sub;
		
	}
	public static void main(String args[])
	{
		//int arr[]=new int[5];
		int arr[]= {1,2,3,4,5};
		int sub[]=new int[5];
		sub=a(arr,2,4);
		for(int i=0;i<=2;i++)
		{
			System.out.println(sub[i]);
		}
		
		
	}
}
