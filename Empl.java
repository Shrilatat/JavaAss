
public class Empl {
	private int id, sal;
	private String name;
	
	public Empl() {};
	
	public Empl(String name, int sal) {
		this.name = name;
		this.sal = sal;
	}
	
	public Empl(String name) {
		this.name = name;
	}
	
	public void details(int id) {
		System.out.println("Empl [id=" + id + ", sal=" + sal + ", name=" + name + "]");
	}

	public static void main(String[] args) {
		Empl e1 = new Empl();
		Empl e2 = new Empl("Employee2", 40000);
		Empl e3 = new Empl("Employee3");
		
		Empl[] employees = {e1, e2, e3};
		
		for(int i = 0; i< employees.length; i++) {
			employees[i].details(i);
		}
	}
	
}
