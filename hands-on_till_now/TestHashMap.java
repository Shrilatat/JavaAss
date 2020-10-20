package day6;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setNames("1", "Bharat");
		student.setNames("2", "Pooja");
		student.setNames("3", "Abhinav");
		student.setNames("4", "Parth");
		student.setNames("5", "Aditi");
		
		
		student.printNames();
		
		try {
			student.getName("7");
		} catch (RollNoOutOfBoundException e) {
			System.out.println("Inside exception......Roll Not found");
		}
		
		student.printSize();
		
		student.remove("4");
		
		student.printSize();
		
	}

}
