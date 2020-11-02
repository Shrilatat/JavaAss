
public class Empl {
	private int id;
	static int nextUniqueId=1;
	private double salary;
	private String name;
	public Empl() {
		id=nextUniqueId++;
	}
	public Empl(String name, double salary) {
		id=nextUniqueId++;
		this.name=name;
		this.salary = salary;
	}
	public Empl(String name) {
		id=nextUniqueId++;
		this.name=name;
	}
	
	
	@Override
	public String toString() {
		return "Empl [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Empl empl1 = new Empl("Raj");
		Empl empl2 = new Empl("Rajesh",100000);
		Empl empl3 = new Empl("Raju");
		System.out.println(empl1);
		System.out.println(empl2);
		System.out.println(empl3);
		}
}
