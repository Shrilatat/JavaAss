


public class Empl {
	
	private static int ref = 1;
	private int id;
	private String name;
	private int sal;
	


	public Empl() {
		super();
		this.id=ref;
		ref+=1;
	}


	public Empl(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
		this.id=ref;
		ref+=1;
	}

	

	public Empl(String name) {
		super();
		this.name = name;
		this.id=ref;
		ref+=1;
	}
	


	@Override
	public String toString() {
		return "Empl [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}


	public static void main(String[] args) {
		Empl e1 = new Empl();
		Empl e2 = new Empl("Hemal",100000);
		Empl e3 = new Empl("Shreyas");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
	}
	
	
}
