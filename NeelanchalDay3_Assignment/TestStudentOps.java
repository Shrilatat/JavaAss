import java.util.Scanner;

public class TestStudentOps {
	
	public static void main(String[] args) {
		
		StudentOps s = new StudentOps();
		Scanner t = new Scanner(System.in);
		System.out.println("No of records you want to add");
		int n = Integer.parseInt(t.next());
		while(n>0) {
		s.setNames();
		n--;
		}
		s.printName();
		s.getName("1");
		s.printSize();
		s.remove("Neel2");
	}

}
