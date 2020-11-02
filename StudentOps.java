import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentOps {
	private Map<String,String> Names = new HashMap<>();

	public void setNames() {
		Names.put("1", "name1");
		Names.put("2", "name2");
		Names.put("3", "name3");
		Names.put("4", "name4");
		Names.put("5", "name5");
	}

	public void printNames() {
		Set<String> keys = Names.keySet();
		for (String s : keys) {
			System.out.println(Names.get(s));
		}		
	}

	public void getName(String key) {
		System.out.println(Names.get(key));	
	}

	public void printSize() {
		System.out.println(Names.size());
	}

	public void remove(String key) {
		Names.remove(key);
	}
}