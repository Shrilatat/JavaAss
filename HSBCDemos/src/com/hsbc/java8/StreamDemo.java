package com.hsbc.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		
		
		/**
		 * 
		 * collectionn.stream()
		 * stream.of(vlaue)
		 * stream.of(v1,v2,v3)
		 * stream.of(arr)
		 * 
		 */
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> nosStream = list.stream();

		Stream<Integer> oddNosStream = nosStream.filter(n -> n % 2 == 1);

		Stream<Integer> sqrStream = oddNosStream.map(n -> n * n);

		// int sum = sqrStream.reduce(0, (n1, n2) -> n1 + n2);

		int sum1 = sqrStream.reduce(0, Integer::sum);
		System.out.println(sum1);

		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 6);
		int sum2 = list2.stream().filter(n -> n % 2 == 1).map(n -> n * n).reduce(0, Integer::sum);

		System.out.println(sum2);
		
		//***************************************88
		
		Stream<String> s1 = Stream.of("Hello","adfa","asdfa");
		s1.forEach(System.out::println);
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
		
		String[] str = {"Aaa","bbb","cc"};
		Stream<String> s2 = Stream.of(str);
		s2.forEach(System.out::println);
		
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		
		String s3 = "Heelo,world,bharat";
		Stream<String> stream3 = Stream.of(s3.split(","));
		stream3.forEach(System.out::println);
		
		//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		
		IntStream stream4 = IntStream.range(1, 51);
		System.out.println(stream4.sum());
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		
		Stream.iterate(0, n->n+5).skip(6).limit(5).forEach(System.out::println);
		
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		
		
		Stream.generate(Math::random).limit(5).sorted().forEach(System.out::println);
	}
}
