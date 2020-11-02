package com.demo;

public class TestEmp {
public static void main(String[] args) {
	
	Employee[] emp = {new SalEmp(101,"a","9461","a@cop.com","accouts","lv 1",new Date(10,6,2015),200000),
			          new ContractEmp(102,"b","9462","b@cop.com","audit","lv 1",new Date(10,6,2016),300,20),
			          new SalesEmp(103,"c","9463","c@cop.com","sales","lv 1",new Date(10,6,2015),500000)};
	
	for(Employee e : emp)
	{
		e.displayEmpDetails();
		e.calSal();
	}
}
}
