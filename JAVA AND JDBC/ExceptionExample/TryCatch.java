package ExceptionExample;

public class TryCatch {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 20;
			int[] array = new int[10];
			int c = array[10] / a;

			System.out.println(c);
		}

		catch (ArithmeticException e) {
			System.out.println("Cannot divide number by zero" + e);
		}
		catch(ArrayIndexOutOfBoundsException o){
			System.out.println("Array index not found" + o);
		}
		System.out.println("HHandled Exception");
	}
}
