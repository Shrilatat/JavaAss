
import java.util.*;

public class StudentNames {
	private Map<String,String> StudentName = new HashMap<>();
	
	public void SetNames(String roll, String name) {
		StudentName.put(roll,name);
		
	}
	public void printNames() {
		Set<String> keys = StudentName.keySet();
		for(String k:keys) {
			System.out.println(StudentName.get(k));
		}
	}
	public void getName(String roll) {
		System.out.println(StudentName.get(roll));
		
	}
	public void printSize() {
		System.out.println(StudentName.size());
		
	}
	public void remove(String roll) {
		StudentName.remove(roll);
	}

}
