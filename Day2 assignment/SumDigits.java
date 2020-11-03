
public class SumDigits {
	
	public static void main(String[] args) {
		
		int x = 15423 , j=0 ;
		int sum = 0 ;
		int arr[] = new int[5];
		for(int i=4 ; i>=0 ; i--)
		{
			int y = x%10;
			arr[j] = y;
			sum = sum + y ;
			x=x/10;
			j++;
		}
		
		System.out.println("sum : " + sum);
		
		for(int i=0 ; i<5 ; i++)
		{
			System.out.println(arr[i] + " ");
		}
	}

}
