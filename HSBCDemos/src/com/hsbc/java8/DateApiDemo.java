package com.hsbc.java8;

import java.time.LocalDate;

public class DateApiDemo {
	public static void main(String[] args) {
	
		LocalDate nowDate = LocalDate.now();
		LocalDate date = LocalDate.of(2020, 1, 2);
		System.out.println(nowDate);
		System.out.println(date);
	}
	
}
