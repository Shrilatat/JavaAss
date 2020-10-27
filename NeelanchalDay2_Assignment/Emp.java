
public class Emp {

	
	private static int R_num = 1;
	private String name = "Neelanchal ";
	private int salary = 50000;
	private int id = R_num++;

	public Emp() {
	}

	public Emp(String name, int salary) {

		this.name = name;
		this.salary = salary;
	}

	public Emp(String name) {

		this.name = name;
	}

	
		@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}

		public static void main(String[] args) {
			
			Emp a1 = new Emp("Neel1");
			Emp a2 = new Emp();
			Emp a3 = new Emp("Neel3",75000);
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			
		}
}
