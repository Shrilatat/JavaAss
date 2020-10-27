
public class Empl {
	private static int id=0;
	private String name;
	private int sal;
	
	public Empl(String name, int sal) {
		this.name = name;
		this.sal = sal;
		id++;
	}
	
	public Empl() {id++;}
	
	public Empl(String name) {
		this.name = name;
		id++;
	}
	
	public String toString() {
		return "Empl [name=" + name + ", sal=" + sal + ", id=" + id +"]";
	}

	public static void main(String[] args) {
		Empl E1= new Empl("Employee1", 10000);
		System.out.println(E1);
		Empl E2= new Empl("Employee2", 100000);
		System.out.println(E2);
		Empl E3= new Empl();
		System.out.println(E3);
	}
	
}
