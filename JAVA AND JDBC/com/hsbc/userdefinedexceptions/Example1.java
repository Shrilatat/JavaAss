package com.hsbc.userdefinedexceptions;

public class Example1 {
	public static void main(String[] args) throws RuntimeException{
		try{
			System.out.println("Try Block");
			
			throw new MyException() ; 	
		}
		catch(MyException e){}
		
	}
}
