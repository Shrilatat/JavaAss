import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentOps {
	private Map<Integer, String> setNames(Map<Integer, String> map, int roll, String name){
		map.put(roll, name);
		return map;
	}
	void printNames(Map<Integer, String> map) {
		Set<Integer> keys = map.keySet();
		for(int i:keys)
			System.out.println(i+": "+map.get(i));
		
	}
	String getName(Map<Integer, String> map,int roll) {
		return map.get(roll);
	}
	int printSize(Map<Integer, String> map) {
		return map.size();
	}
	Map<Integer, String> remove(Map<Integer, String> map, int roll){
		map.remove(roll);
		return map;
	}
	public static void main(String[] args) {
		StudentOps sops = new StudentOps();
		Map<String, String> map = new HashMap<>();
		map.put("Kamlesh","Rajesh");
		String name = "Kamlesh";
		System.out.println(map.get(name));
		
	}
	
	
}
