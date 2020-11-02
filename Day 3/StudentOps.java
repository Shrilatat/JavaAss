import java.util.*;
public class StudentOps {
	
	private String rollNo;
	private String name;
	
	private HashMap<String,String> studNames = new HashMap<>();
	
	public void setNames()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter roll no.");
		rollNo = s.next();
		System.out.println("Enter name");
		name = s.next();
		studNames.put(rollNo, name);
	}
	
	public void printName()
	{
		Set<String> keys = studNames.keySet();
		for(String key : keys)
			System.out.println(key+": "+studNames.get(key));
	}
	
	public void getName(String key)
	{
		if(studNames.containsKey(key))
			System.out.println("Student with roll no "+key+": "+studNames.get(key));
		else
			System.out.println("Invalid entry");
	}
	
	public void printSize()
	{
		System.out.println("Total students: "+studNames.size());
	}
	
	public void remove(String key)
	{
		studNames.remove(key);
	}
}
