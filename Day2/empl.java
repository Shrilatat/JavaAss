

public class empl {
	private int id;
	private String name;
	private int sal;
	private static int count;

	public empl() {
		count+=1;
		id = count;
	}

	public empl(String name, int sal) {
		this.name = name;
		this.sal = sal;
		count+=1;
		id = count;
	}

	public empl(String name) {
		this.name = name;
		count+=1;
		id = count;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static void main(String[] args) {
		empl emp[] = new empl[3];
		emp[0] = new empl();
		emp[1] = new empl("tony", 5000);
		emp[2] = new empl("dexter", 10000);

		for (empl e : emp) {
			System.out.println("Employee id "+e);
		}

	}
}
