package day6;

public class ArrayListDemo {
	public static void main(String[] args) {
		StudentOp students = new StudentOp();
		students.setNames();
		students.printNames();
		students.addName("Smriti");
		students.printNames();
		students.searchName(3);
		students.searchname("Parth");
		students.removename("Aditi");
	}
	
	
}
