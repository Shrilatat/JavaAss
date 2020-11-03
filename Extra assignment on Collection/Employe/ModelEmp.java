package com.hsbc.AssignCollect;

import java.util.Date;

public class ModelEmp {
   
	public static void main(String[] args) {
		
		AbcEmp SalEmp = new SalarEmp(1, "Emp1" , 5533 , "E1.com" , "sack" , "Sal" , new Date() , 80);
		AbcEmp SalesEmp = new SaleEmp(2, " Emp2", 4520, "E2.com", "Korma", "Sale", new Date(), 20);
		AbcEmp ConEmp = new contEmp(3 , "Emp3" , 5890 , "E3.com", "Rage", "Cont", new Date(), 8, 25 );
		
		AbcEmp[] Emp = {SalEmp , SalesEmp , ConEmp} ;
		
		for(AbcEmp E : Emp)
		{
			E.calcSal();
			System.out.println(E.despDetails());
		}
	}
    	
}
