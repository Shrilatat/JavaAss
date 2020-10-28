package JavaAss;
import java.util.ArrayList;


public class studentDemo {
	
	ArrayList<String> students= new ArrayList<String> ();
	
	
	
	public void setName(String name) {
		students.add(name);
	}
	
	public void search(String name) {
		if(students.contains(name)) {
			System.out.println("name is present"+students.get(students.indexOf(name)));
		}else {
			System.out.println("Name not present");
		}
	}
	
	public void printName() {
		for(String nameString :students)
			System.out.println(nameString);
	}
	

	public void remove(String name) {
		if(students.contains(name)) {
			System.out.println(students.remove(students.indexOf(name)));
		}else {
			System.out.println("Name not present");
		}
	}
	
	
	public static void main(String[] args) {
		studentDemo sd = new studentDemo();
		sd.setName("chirag");
		sd.setName("hello");
		sd.setName("gangam");
		sd.printName();
		sd.search("hi");
		sd.search("chirag");
		sd.remove("hello");
		sd.printName();
	}

}
