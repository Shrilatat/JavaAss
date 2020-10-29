package Day3Ass;

import java.util.Scanner;

public class TestStudentOps {

	public static void main(String[] args) {

		StudentOps school = new StudentOps();
		Scanner s = new Scanner(System.in);
		System.out.println("No of records you want to add");
		int n = Integer.parseInt(s.next());
		while(n>0) {
			school.setNames();
			n--;
		}
		school.printName();
		school.getName(1);
		school.printSize();
		school.remove(2);
		school.printName();
		s.close();
	}

}
