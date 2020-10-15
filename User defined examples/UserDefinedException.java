package day5Mon;

class MyException extends Exception {
	String str1;

	public MyException(String str2) {
		this.str1=str2;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("MyExcepption occured here!!! "+str1);
	}
}

public class UserDefinedException {
	public static void main(String[] args) {
		try {
			System.out.println("Inside main");
			throw new MyException("Exception has occured");
			
		}catch(MyException e) {
			System.out.println("Inside catch");
			System.out.println(e);
		}
	}
}
