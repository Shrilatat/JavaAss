package com.trg.annon;

import java.util.stream.IntStream;

public class StreamDemo3 {
	
	public static void main(String[] args) {
		int sum = IntStream.range(1, 51).sum();
		System.out.println(sum);

	}
}
