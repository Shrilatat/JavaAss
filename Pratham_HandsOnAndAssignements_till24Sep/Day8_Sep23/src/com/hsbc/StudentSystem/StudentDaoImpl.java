package com.hsbc.StudentSystem;
import java.util.*;
class NameNotFound extends Exception{

	public NameNotFound() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NameNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

public class StudentDaoImpl implements StudentDaoIntf{
	
	Map<Integer, String> studentNames = new HashMap<>();
	
	@Override
	public void setname() {
		Student s1 = new Student(1,"Mike");
		Student s2 = new Student(2,"Ross");
		Student s3 = new Student(3,"Emma");
		studentNames.put(s1.getRollNumber(),s1.getStudentName() );
		studentNames.put(s2.getRollNumber(),s2.getStudentName() );
		studentNames.put(s3.getRollNumber(),s3.getStudentName() );
		
	}

	@Override
	public void printNames() {
		Set<Integer> keys = new HashSet();
		keys=studentNames.keySet();
		for(int i: keys) {
			System.out.println(studentNames.get(i));
		}
	}

	@Override
	public void getName(String key) {
		Set<Integer> keys = new HashSet();
		keys=studentNames.keySet();
		for(int i: keys) {
			System.out.println(studentNames.get(i));
		}
		
	}

	@Override
	public void printSize() {
		System.out.println("The size of map is : "+studentNames.size());
		
	}

	@Override
	public void remove(String key) {
		
		
	}

}
