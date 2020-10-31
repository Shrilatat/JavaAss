package com.abc.collections;

public class TestStudentOps {
	public static void main(String[] args) {
		StudentOpsAssign stds = new StudentOpsAssign();
		stds.setNames();
		stds.printNames();
		stds.getName("abc1");
		stds.printSize();
		stds.remove("abc5");
		stds.printNames();
	}
}
