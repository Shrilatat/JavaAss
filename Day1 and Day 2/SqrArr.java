package com.trg;

public class SqrArr {
	
	
	public static void main(String[] args) {
		SumAndAvg arr1 = new SumAndAvg();
		int arr2[] = arr1.getArr();
		
		for( int i=0; i<arr2.length;i++) {
			arr2[i]=arr2[i]*arr2[i];
		}
		
		for(int j:arr2) {
			System.out.println(j);
		}
	}
}
