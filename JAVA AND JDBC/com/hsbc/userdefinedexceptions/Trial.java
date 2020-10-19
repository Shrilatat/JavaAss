package com.hsbc.userdefinedexceptions;

class UsedDefinedException extends Exception{
	UsedDefinedException(String s){
		super(s);
	}
	
	public UsedDefinedException() {
		// TODO Auto-generated constructor stub
	}

	void display(int num) throws UsedDefinedException{
		if(num == 0){
			throw new UsedDefinedException("Exception Caught!! ");
		}
	}
}


public class Trial {
	public static void main(String[] args) {
		UsedDefinedException e = new UsedDefinedException();
		try{
			e.display(0);
		}
		catch(UsedDefinedException g){
			System.out.println("Exceptioh handled \n" + g);
		}
	}
}
