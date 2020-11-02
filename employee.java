package JavaAss;


public class employee {
	private int id;
	private String ename;
	private float salary;
	private static int empId = 1;
	
	public employee() {
		this.id = empId++;
	}
	public employee(String ename) {
		this.id = empId++;
		this.ename = ename;
	}
	public employee(String ename, float salary) {
		this.id = empId++;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Empl [id=" + id + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) {
		employee[] empArray = new employee[3];
		
		empArray[0] = new employee("Name1", 100);
		empArray[1] = new employee("Name2",200);
		empArray[2] = new employee("Name3",300);
		
		for(employee emp : empArray)
			System.out.println(emp);
	}
}
