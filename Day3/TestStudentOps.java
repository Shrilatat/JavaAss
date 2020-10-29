

public class TestStudentOps {
	public static void main(String[] args) {
		StudentNames stu = new StudentNames();
		stu.SetNames("01", "dexter");
		stu.SetNames("02", "kino");
		stu.SetNames("03", "william");
		stu.printSize();
		stu.printNames();
		stu.remove("03");
		stu.getName("01");
		stu.printSize();
	}

}
