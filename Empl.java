
public class Empl {
	private static int id=0;
	private String name;
	private int sal;
	
	public Empl(String name, int sal) {
		this.name = name;
		this.sal = sal;
	}
	
	public Empl() {}
	
	public Empl(String name) {
		this.name = name;
	}
	
	public String toString() {
		id++;
		return "Empl [name=" + name + ", sal=" + sal + ", id=" + id +"]";
	}

	public static void main(String[] args) {
		Empl E1= new Empl("Employee1", 10000);
		Empl E2= new Empl("Employee2", 100000);
		Empl E3= new Empl();
		System.out.println(E1);
		System.out.println(E2);
		System.out.println(E3);
	}
	
}
