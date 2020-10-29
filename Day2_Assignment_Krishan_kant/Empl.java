
public class Empl {
	String name;
	int sal;
	int id;
	
	static int c;
	
	public Empl() {
		c=c+1;
		id=c;
	}
		
	public Empl(String name, int sal) {
		this.name = name;
		this.sal = sal;
		c=c+1;
		id=c;
	}
	public Empl(String name) {
		this.name = name;
		c=c+1;
		id=c;
	}

	@Override
	public String toString() {
		return "Empl [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	public static void main(String[] args)
	{
		Empl e1=new Empl();
		Empl e2=new Empl("Shivam",160000);
		Empl e3=new Empl("Deepak");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
	}
	
}
