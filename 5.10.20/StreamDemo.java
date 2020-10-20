package com.trg.annon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		/*
		 * List<Integer> list = Arrays.asList(10 , 20 , 30 ,40 ,50); Stream<Integer>
		 * stream = list.stream(); //sequential stream
		 * stream.forEach(System.out::println);
		 */
		
		List<Integer> list  = Arrays.asList(1, 2 , 3 ,4 ,5);
		Stream<Integer> nosStream = list.stream(); 
		Stream<Integer> oddNosStream = nosStream.filter(n -> n%2 ==1);
		Stream<Integer> sqrStream = oddNosStream.map(n -> n*n);
		
		//int sum = sqrStream.reduce(0 , (n1,n2) -> n1+n2); //take 1st two nos from stream and the result n1+n2 will be the next seed value
		int sum1 =  sqrStream.reduce(0 , Integer::sum);
		
		System.out.println(sum1);
		
		int sum2 = list.stream()
								.filter(n ->n%2 == 1)
								.map(n -> n*n)
								.reduce(0 , Integer::sum);
								
		System.out.println("The sum is" + sum2);
		
		
		
		
	}
}
