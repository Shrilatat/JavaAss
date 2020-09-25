package com.hsbc.practise;

import java.util.*;

public class StuOps {
	List<Stu> students = new LinkedList<>();
	Stu s = new Stu();
	public void addStu(Stu s)
	{
		students.add(s);
	}
	public void displayAllStu()
	{
		for(Object i : students)
			System.out.println(i);
	}
	public void addStu(int i, String string) {
		s.setStuName(string);
		s.setStuNo(i);
	}
}