package com.trg;
import java.util.*;

public class SubArr {
	private static int arr5[];
	
	public static void main(String[] args) {
		SumAndAvg ob = new SumAndAvg();
		int start=1;
		int end=3;
		int a1[] = ob.getArr();
		
		arr5 = Arrays.copyOfRange(a1,start,end);
		
		for(int i=0;i<arr5.length;i++) {
			arr5[i] = arr5[i]*arr5[i];
		}
		
		
		for(int i:arr5) {
			System.out.println(i);
		}
		
		
	}
}
