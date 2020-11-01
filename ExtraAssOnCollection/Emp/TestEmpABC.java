package com.hsbc.collection_Assignment;

public class TestEmpABC {
	
	public static void main(String[] args) {
		
		Emp_ABC a = new Salaried_Emp(16145032, 88, "Neel", "Neel@abc.co.in", "Payments", "Software Engineer",new Date(9,28,2017), 75000);
		Emp_ABC b = new SalesEmp(16145033, 89, "Neeraj", "Neeraj@abc.co.in", "Technology", "Full stack developer", new Date(9,29,2017), 998456);
		Emp_ABC c = new ContractEmp(16145034, 90, "Nupur", "Nupur@abc.co.in", "Functional", "Trainee Engineer", new Date(9,27,2017), 56, 1200);
		
		Emp_ABC [] e = {a,b,c};
		
		for(Emp_ABC t : e)
		{
			t.DispDetails();
			t.CalSal();
			System.out.println(" ");
		}
		
	}

}
