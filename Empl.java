
public class Empl {
	
	private static int id_count=0;
	private int id;
	private String name;
	private int sal;
	
	public Empl() {
		id_count = id_count+1;
		this.id = id_count;
	}

	public Empl(String name, int sal) {
		this.name = name;
		this.sal = sal;
		
		id_count = id_count+1;
		this.id = id_count;
	}

	public Empl(String name) {
		this.name = name;
		
		id_count = id_count+1;
		this.id = id_count;
	}

	public String toString() {
		return "Employee [id=" + id + ", Name=" + name + ", salary=" + sal + "]";
	}
	
	public static void main(String[] args) {
		
		
		Empl e1 = new Empl();
		Empl e2 = new Empl("Nisha");
		Empl e3 = new Empl("Juhi", 3000);
		
		System.out.println(e1 + " " + e2 + " "+ e3);
		

	}
	
	
	
}

