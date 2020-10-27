
public class EmplAssign {
	static int emp_id = 0;
	private int emp_salary;
	private String emp_name;
	
	public EmplAssign() {
		emp_id = emp_id + 1;
		System.out.println("emp_id: "+emp_id);
	}
	
	public EmplAssign(String emp_name, int emp_salary) {
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		emp_id = emp_id + 1;
		System.out.println("emp_id: "+emp_id+" emp_name: "+emp_name+" emp_salary:"+emp_salary);
	}
	
	public EmplAssign(String emp_name) {
		this.emp_name = emp_name;
		emp_id = emp_id + 1;
		System.out.println("emp_id: "+emp_id+" emp_name: "+emp_name);
	}

	public static void main(String[] args) {
		EmplAssign e1 = new EmplAssign();
		EmplAssign e2 = new EmplAssign("emp_2");
		EmplAssign e3 = new EmplAssign("emp_3",50000);
	}
}
