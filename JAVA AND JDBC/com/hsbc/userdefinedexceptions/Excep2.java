package com.hsbc.userdefinedexceptions;

class InappropriateInputException extends Exception {
	public InappropriateInputException(String s) {
		super(s);
	}
}

public class Excep2 {
	void getInput(int num) throws InappropriateInputException{
		if(num<0)
			throw new InappropriateInputException("Input invalid!!!");
	}
	
	public static void main(String[] args) {
		Excep2 e = new Excep2();
		try {
			System.out.println("In try block");
			e.getInput(-20);
		} catch (InappropriateInputException e2) {
			// TODO: handle exception
			System.out.println("Invalid Input Exception Handled \n" + e2);
		}
	}
}