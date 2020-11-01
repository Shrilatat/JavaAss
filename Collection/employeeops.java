package Assday5;

public class employeeops {
	
	public static void main(String[] args) {
		employee A = new SalriedEmp(101, "Aayush", "A@mail.com", "Pen-test", "Trainee", "10-10-10", 100000);
		employee B = new SalesEmp(101, "Aayush", "A@mail.com", "Pen-test", "Trainee", "10-10-10", 1000);
		employee C = new ContractEmp(101, "Aayush", "A@mail.com", "Pen-test", "Trainee", "10-10-10", 100, 10.15);
		
		employee[] employees = {A,B,C};
		
		for (employee e : employees) {
			e.DispDetail();
			e.calcsalry();
		}
	}

}
