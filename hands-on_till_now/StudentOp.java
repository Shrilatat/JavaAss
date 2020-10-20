package day6;

import java.util.ArrayList;

public class StudentOp {
	private ArrayList<String> names = null;

	public StudentOp() {
		names = new ArrayList<>();
	}
	
	public void setNames() {
		names.add("Bharat");
		names.add("Parth");
		names.add("Aditi");
	}
	
	public void addName(String str) {
		names.add(str);
	}
	
	public void searchname(String str) {
		System.out.println( names.indexOf(str));
	}
	
	public void searchName(int index) {
		System.out.println(names.get(index));
	}
	
	public void printNames() {
		System.out.println(names);
	}
	
	public void removename(String stuName) {
		names.remove(stuName);
		System.out.println("After removal:");
		System.out.println(names);
	}
	
}
