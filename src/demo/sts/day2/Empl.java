package demo.sts.day2;

public class Empl {
	private int id;
	private String ename;
	private float salary;
	private static int maxId = 0;
	
	public Empl() {
		this.id = ++maxId;
	}
	public Empl(String ename) {
		this.id = ++maxId;
		this.ename = ename;
	}
	public Empl(String ename, float salary) {
		this.id = ++maxId;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Empl [id=" + id + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) {
		Empl[] empArray = new Empl[3];
		
		empArray[0] = new Empl("Name1", 1999.99f);
		empArray[1] = new Empl("Name2", 2499.99f);
		empArray[2] = new Empl("Name3", 4999.99f);
		
		for(Empl emp : empArray)
			System.out.println(emp);
	}
}
