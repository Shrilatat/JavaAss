package com.hsbc.setExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	private TreeSet<Integer> intSet = new TreeSet<>();

	void add() {
		intSet.add(1);
		intSet.add(2);
		intSet.add(3);
		intSet.add(4);
		intSet.add(5);
	}

	void display() {
		for (Integer integer : intSet) {
			System.out.println(integer);
		}
	}

	void revDisplay() {
		Iterator<Integer> it = intSet.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	void greatestElement(int num) {
		System.out.println(intSet.lower(num));
	}

	void greatestOrLess(int num) {
		System.out.println(intSet.floor(num));
	}

	void removeRetrieveFirstLast() {
		int first = intSet.pollFirst();
		int last = intSet.pollLast();

		System.out.println("First and last : " + first + " " + last);
	}

	void subSet(int start, int end) {
		System.out.println(intSet.subSet(start, end));
	}

	void geFirst() {
		System.out.println(intSet.first());
	}

	void userSubSet(int value) {
		System.out.println(intSet.headSet(value));
	}

	public static void main(String[] args) {
		SetExample s = new SetExample();

		s.add();

		s.display();

		s.revDisplay();

		s.greatestElement(4);

		s.greatestOrLess(4);

		s.removeRetrieveFirstLast();

		s.subSet(0, 3);

		s.geFirst();

		s.userSubSet(4);

	}
}
