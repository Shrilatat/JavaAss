import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Emp {
	@Override
	public String toString() {
		return "Emp [emp=" + emp + ", ename=" + ename + "]";
	}

	public Emp(int emp, String ename) {
		super();
		this.emp = emp;
		this.ename = ename;
	}

	int emp;

	public int getEmp() {
		return emp;
	}

	public void setEmp(int emp) {
		this.emp = emp;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	String ename;

}

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Jan");
		map.put(2, "Feb");
		map.put(3, "Mar");
		map.put(4, "Apr");

		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key + " : " + map.get(key));
		}

		System.out.println(map.get(1));
		
		Map<String,Emp> m = new HashMap<>();
		m.put("KshitijV", new Emp(101,"Kshitij Vengurlekar"));
		m.put("Second", new Emp(102,"Second Name"));
	}
}
