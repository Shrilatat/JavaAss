
public class Empl {
	//private int id;
	private String name="Unknown";
	private float sal=100000;
	private static int num =100;
	private int id =num++;
	public Empl() {
	}
	public Empl(String name,float sal) {
		this.name=name;
		this.sal=sal;
	}
	public Empl(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "Empl [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	public static void main(String[] args) {
		Empl emp1=new Empl("John", 125000);
		Empl emp2=new Empl("Jacob");
		Empl emp3= new Empl();
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}
}
