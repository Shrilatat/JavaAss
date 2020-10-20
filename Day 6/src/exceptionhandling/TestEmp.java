package exceptionhandling;
public class TestEmp {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.setEmpid(101);
		
		try {
			e1.setEname("Aditi");
		} catch (InvalidNameException e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println(e1);
	}
}
