package com.trg;

public class SumAndAvg {
	private static int arr[] = {1,2,3,4,5};
	
		public static int[] getArr() {
		return arr;
	}



	public static void setArr(int[] arr) {
		SumAndAvg.arr = arr;
	}


		public static void main(String[] args) {
			int sum=0;
			float avg=0;
			for(int i:arr) {
				sum+=i;
			}
			avg = (float)sum/arr.length;
			
			System.out.println("sum = " + sum);
			System.out.println("avg = " + avg);
		}
}
