package com.hsbc.userdefinedexceptions;

import java.io.*;

public class Example extends Exception {
	public static void main(String[] args) throws IOException {
		FileInputStream i = null;

		i = new FileInputStream("input.txt");

		int k;

		while ((k = i.read()) != -1) {
			System.out.println((char) k);
		}
		if (i == null) {
			i.close();
		}
	}
}
