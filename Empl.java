
public class Empl {
	
	private static int idRef;
	private int id;
	private int sal;
	private String name;
	
	
	public Empl() {
		this.id = ++idRef;
	};
	
	public Empl(String name, int sal) {
		this.id = ++idRef;
		this.name = name;
		this.sal = sal;
	}
	
	public Empl(String name) {
		this.id = ++idRef;
		this.name = name;
	}
	
	
	public String toString() {
		return "Empl [id=" + id + ", sal=" + sal + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Empl e1 = new Empl();
		Empl e2 = new Empl("Employee2", 40000);
		Empl e3 = new Empl("Employee3");
		
		Empl[] employees = {e1, e2, e3};
		
		for(Empl e : employees) {
			System.out.println(e);
		}
		
		
	}
	
}
