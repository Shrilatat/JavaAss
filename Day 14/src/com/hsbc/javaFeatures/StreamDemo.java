package com.hsbc.javaFeatures;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

/*//		Stream<Integer> stream = list.stream();
//		stream.forEach(System.out::println);

		Stream<Integer> nosStream = list.stream();
		Stream<Integer> oddNosStream = nosStream.filter(n -> n % 2 == 1);
		Stream<Integer> sqrStream = oddNosStream.map(n -> n * n);

//		sqrStream.forEach(System.out::println);

//		int sum = sqrStream.reduce(0, (n1, n2) -> n1 + n2);
		
		int sum = sqrStream.reduce(0, Integer::sum);
		System.out.println(sum);

		*/
		
		// start chaining
		
		int sum =list	.stream()
						.filter(n -> n % 2 == 1)
						.map(n -> n*n)
						.reduce(0, Integer::sum);
		
		System.out.println(sum);
			
	}
}
