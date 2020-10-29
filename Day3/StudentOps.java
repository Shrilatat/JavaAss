package Day3Ass;
import java.util.HashMap;
import java.util.Scanner;

public class StudentOps {
	
	private String name;
	private Integer rollno;
	
	private HashMap<Integer, String> school = new HashMap<>();

	public void setNames () {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter roll number of student ");
		rollno = s.nextInt();
		System.out.println("Enter name of student ");
		name = s.next();
		school.put(rollno,name);

	}

	public void printName() {

		for(Integer key : school.keySet() )
			System.out.println(key + ": "+ school.get(key));
	}

	public void getName(Integer k) {
		if(school.containsKey(k))
			System.out.println("Student having roll no " + k +" is " + school.get(k));
		else 
			System.out.println("Wrong R.No");
	}

	public void printSize() {
		System.out.println(school.size());
	}

	public void remove(Integer k) {
		school.remove(k);
	}

}
