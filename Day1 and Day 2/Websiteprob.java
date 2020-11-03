package com.trg;

public class Websiteprob {
	public static void main(String[] args) {
		
		
		String[] websites = {"www.google.com", "www.msn.com", 
							"www.amazon.co.in", 
							"in.answers.yahoo.com", 
							"en.m.wikipedia.com", 
							"codehs.gitbooks.io", 
							"www.coderanch.com" };
		int count = 0;
		
		for (String s : websites)
			if (s.length()>=3 && s.charAt(0)=='w' && s.charAt(1)=='w'
			&& s.charAt(2)=='w')
				count++;
		
		System.out.println("Number of Websites beginning with www = " + count);
	}
}
