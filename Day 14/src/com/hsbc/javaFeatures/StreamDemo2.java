package com.hsbc.javaFeatures;

import java.util.*;
import java.util.stream.*;

public class StreamDemo2 {

	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

/*		String[] str = { "aaa", "bbb", "ccc" };

		Stream<String> s1 = Stream.of(str);
		s1.forEach(System.out::println);
		
	*/	
		IntStream s1 = IntStream.range(1,51);
		System.out.println(s1.sum());
		

	}
}
