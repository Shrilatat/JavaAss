package day5Mon;

class invalidException extends Exception {
	public invalidException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}

public class UserDefinedException2 {
	void check(int i) throws invalidException {
		if (i < 10) {
			throw new invalidException("Invalid Data");
		}
	}

	public static void main(String[] args) {
		UserDefinedException2 obj = new UserDefinedException2();
		try {
			obj.check(5);
		} catch (invalidException e) {
			System.out.println(e.getMessage());
		}
	}

}
