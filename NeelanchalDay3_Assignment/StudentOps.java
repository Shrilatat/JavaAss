import java.util.*;

public class StudentOps {
	
	private String rollNo;
	private String name;
	
	private HashMap<String, String> studNames = new HashMap<>();

	public void setNames () {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter roll number of student ");
		rollNo = s.next();
		System.out.println("Enter name of student ");
		name = s.next();
		studNames.put(rollNo,name);
	}
	
	public void printName() {
		
		Set<String> keys = studNames.keySet();
		for(String key : keys )
			System.out.println(key + ": "+ studNames.get(key));
	}
	
	public void getName(String k) {
		if(studNames.containsKey(k))
			System.out.println("Name of the student having roll no " + k +" is " + studNames.get(k));
		else 
			System.out.println("Wrong entry");
	}
	
	public void printSize() {
		System.out.println(studNames.size()+" records found ");
	}
	
	public void remove(String k) {
		studNames.remove(k);
	}
}
