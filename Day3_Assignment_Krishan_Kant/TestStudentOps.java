package demo;

public class TestStudentOps {

	public static void main(String[] args)
	{
		StudentOps s1=new StudentOps(1,"Krishan");
//		StudentOps s2=new StudentOps(2,"Krish");
		s1.setNames();
//		s2.setNames();
		s1.printNames();
		s1.getName("Krishan");
		s1.printSize();
//		s1.remove(1);
	}
}
