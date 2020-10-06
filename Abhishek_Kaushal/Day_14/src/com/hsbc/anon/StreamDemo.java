package com.hsbc.anon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		Stream<Integer> nosStream = list.stream();
//		Stream<Integer> oddNosStream = nosStream.filter(n -> n%2 == 1);
//		Stream<Integer> sqrStream = oddNosStream.map(n -> n*n);
//		//int sum = sqrStream.reduce(0, (n1,n2) -> n1+n2);
//		int sum1 = sqrStream.reduce(0, Integer::sum);
//		System.out.println(sum1);
		
		
		int sum2 = list.stream()
			.filter(n -> n%2 == 1)
			.map(n -> n*n)
			.reduce(0, Integer::sum);
		System.out.println(sum2);
		
		
		Stream<String> s1 = Stream.of("Hello" , "gggfh" , "vgjhfh" , "bjg");
		s1.forEach(System.out::println);
		
		
		IntStream si1 = IntStream.range(1, 50);
		System.out.println(si1.sum());
		
	}

}
