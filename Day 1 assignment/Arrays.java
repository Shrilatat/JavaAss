package javademo;

public class Arrays {
     public static void main(String[] args) {
		
    	 int arr[] = new int[5];
    	 int sum = 0 , avg = 0;
    	 for(int i=0 ; i<5 ; i++)
    	 {
    		 arr[i]=i+1;
    		 sum = sum + arr[i];
    	 }
    	 avg = sum/5;
    	 System.out.println("sum = " + sum + " avg = " + avg );
    	 
	}
}
