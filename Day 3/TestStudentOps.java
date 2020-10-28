import java.util.*;
public class TestStudentOps {
	public static void main(String[] args) {
		
		StudentOps st = new StudentOps();
		System.out.println("No of students:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		while(n>0)
			{
			st.setNames();
			n--;
			}
		
		st.printName();
		st.getName("2");
		st.printSize();
		st.remove("John");
		st.printName();
		
	}
}
