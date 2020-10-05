package com.hsbc.javaFeatures;

import java.io.*;
import java.util.stream.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StreamDemo3 {

	public static void main(String[] args) throws IOException {
		String filename = "D:\\HSBC\\WS1\\Day 14\\src\\com\\hsbc\\javaFeatures\\names.txt";
		Stream<String> stream = Files.lines(Paths.get(filename));
		stream.sorted()
			.filter(e -> e.length() < 10)
			.forEach(System.out::println);
	}

}
