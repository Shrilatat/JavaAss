package com.hsbc.collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrList 
{
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		
		Iterator<Integer> it = list1.iterator();
		while(it.hasNext())
		{
			int i = it.next();
			System.out.println(i*i);
			
		}
	}
	
	

}
