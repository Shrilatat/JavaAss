package javademo;

public class arrayNew {
	public static void main(String[] args) {
		int arr[] = new int[5];
		int arrN[] = new int[5];
		
		for(int i=0 ; i<5 ; i++)
		{
			arr[i]=i+1;
			arrN[i]= arr[i]*arr[i];
			System.out.println(arrN[i]);
		}
	}

}
