package com.hsbc;

public class VarArgsDemo {
	
	public static int add(int...arr)
	{//ellipses
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		System.out.println(add(10,20,40,76,89,45));
	}
}
