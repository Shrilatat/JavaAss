
public class emp {
	private int empid=0;
	private String name;
	private double sal;
	static int count=0;

	public emp(String name, int sal) {
		this.name = name;
		this.sal = sal;
		empid=count++;
	}

	public emp() {empid=count++;}

	public emp(String name) {
		this.name = name;
		empid=count++;
	}


	public String toString() {
		return "emp [empid=" + empid + ", name=" + name + ", sal=" + sal + "]";
	}

	public static void main(String[] args) {
		emp E1= new emp("Emp1", 1000);
		System.out.println(E1);
		emp E2= new emp("Emp2", 10000);
		System.out.println(E2);
		emp E3= new emp();
		System.out.println(E3);
	}
}