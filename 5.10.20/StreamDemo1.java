package com.trg.annon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {
	
	public static void main(String[] args) {
		List<Integer> list  = Arrays.asList(1, 2 , 3 ,4 ,5);
		String[] str = {"aaa" , "bbb"  ,"ccc"};
		
		Stream<String> s1 = Stream.of(str);
		s1.forEach((System.out::println));
		
		
	}

}
