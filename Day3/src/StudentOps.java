import java.util.HashMap;
import java.util.Set;

public class StudentOps {
	
	private HashMap<String, String> hmap = new HashMap<>();
	
	public void setName() {
		int N = 5;
		String S = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0; i<=N; i++) {
			
			int k = 100+i;
			String key = Integer.toString(k);
			String name = "Student" + S.charAt(i);
			
			hmap.put(key, name);
		}
		
		
	}
	
	public void printName() {
		
		System.out.println("All Students:");
		Set<String> str =  hmap.keySet();
		for (String s : str){
			System.out.println(s);
		}		
	}
	
	public void getName(String key) {
		System.out.println("Key"+ key +" : " + hmap.get(key));
		
	}
	
	public void printSize() {
		System.out.println(hmap.size());
	}
	
	public void remove(String key) {
		
		System.out.println(hmap.get(key)+ " removed\n");
		hmap.remove(key);	
		
	}
}
