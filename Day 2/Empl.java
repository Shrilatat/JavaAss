
public class Empl {
	private static int n= 1;
	private String name = "Ashwin";
	private int salary = 65000;
	private int id = n++;
	
	public Empl( ) {}

	public Empl(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public Empl(String name) {
		this.name = name;
	}

	public String toString() {
		return "Empl [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}
	
	public static void main(String[] args) {
		Empl e1 = new Empl("Ash");
		Empl e2 = new Empl();
		Empl e3 = new Empl("Ash S",90000);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
	
}
