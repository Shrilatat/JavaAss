package com.hsbc.AssignCollect;

import java.util.Date;
import java.util.Scanner;

public class CustomerCRUDmanager {
	
	public static void main(String[] args) {
		

		CustomerDao Cu = new CustomerDao();
		
		


		
		
	       Scanner sc =  new Scanner(System.in);
			
	        boolean x = true ;
	        while(x)
	        {
	        	System.out.println("Enter 1 for adding new Customer details");
				System.out.println("Enter 2 for updating Customer details");
				System.out.println("Enter 3 for deleting Customer record");
				System.out.println("Enter 4 for viewing all Customer details");
				System.out.println("Enter 5 for viewing Customer by id");
				System.out.println("Enter 6 for exit");

				
				
	    		
	        	System.out.println("Select any one of the options above");
	        	int n = sc.nextInt();
	        	
	        	if(n==1)
	        	{
	        		System.out.println("Enter Account id : ");
	    			int id = sc.nextInt();
	    			System.out.println("Enter name ");
	    			String name = sc.next();
	    			System.out.println("Enter Address :");
	    			String type = sc.next();
	    			System.out.println("Enter contact number : ");
	    			int bal = (int) sc.nextDouble();
	    			System.out.println("Enter year, month and date of DOB:");
	    			int y = sc.nextInt();
	    			int m = sc.nextInt();
	    			int d = sc.nextInt();
	    			
					Customer a = new Customer(id,name, type, bal, new Date(y,m,d));
					Cu.insert(a);
					
					System.out.println("if you want to continue enter 1 else enter 0");
					int p = sc.nextInt();
					if(p==0)
					{
						x=false;
					}
					
	        	}
	        	
	        	else if(n==2)
	        	{
	        		System.out.println("Enter id of Customer and contact number to be updated");
	        		int id = sc.nextInt();
	        		int conNo = sc.nextInt();
	        		Cu.update(id, conNo);
	        		System.out.println("if you want to continue enter 1 else enter 0");
					int p = sc.nextInt();
					if(p==0)
					{
						x=false;
					}
	        	}
	        	
	        	else if(n==3)
	        	{
	        		System.out.println("Enter id of customer to be removed");
	        		int id = sc.nextInt();
	        		Cu.delete(id);
	        		
	        		System.out.println("if you want to continue enter 1 else enter 0");
					int p = sc.nextInt();
					if(p==0)
					{
						x=false;
					}
	        		
	        	}
	        	
	        	else if(n==4)
	        	{
	        		Cu.displayAll();
	        		System.out.println("if you want to continue enter 1 else enter 0");
					int p = sc.nextInt();
					if(p==0)
					{
						x=false;
					}
	        	}
	        	
	        	else if(n==5)
	        	{
	        		System.out.println("Enter id of account for which details to be showed");
	        		int id =sc.nextInt();
	        		Cu.displayById(id);
	        		System.out.println("if you want to continue enter 1 else enter 0");
					int p = sc.nextInt();
					if(p==0)
					{
						x=false;
					}
	        	}
	        	else if(n==6)
	        	{
	        		System.out.println("Exited");
	        		System.out.println("if you want to continue enter 1 else enter 0");
					int p = sc.nextInt();
					if(p==0)
					{
						x=false;
					}
	        	}
	        		
	        	else 
	        	{
	        		System.out.println("Invalid option chosen try again!!");
	        		System.out.println("if you want to continue enter 1 else enter 0");
					int p = sc.nextInt();
					if(p==0)
					{
						x=false;
					}
	        	}
	        }
		
	}

}
