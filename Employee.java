
public class Employee {
	
	private int id,sal;
	private String empName;
	
	public Employee() { 	}
	
	public Employee(int sal, String empName) {
		this.sal = sal;
		this.empName = empName;
	}
	

	public Employee(String empName) {
		this.empName = empName;
	}

	public void details(int id) {
		System.out.println("Employee id : " + id + " ; Employee name : " + empName + " ; Employee salary : " + sal + "\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(70000, "abcd");
		Employee emp3 = new Employee("wxyz");
		
		Employee emps[] = {emp1, emp2, emp3};
		
		for(int i=0; i < emps.length; i++) {
			emps[i].details(i + 100);
		}

	}

}
