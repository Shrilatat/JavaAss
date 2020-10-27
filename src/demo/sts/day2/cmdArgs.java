package demo.sts.day2;

public class cmdArgs {
	public static void main(String[] args) {
		String message = args[0];
		for (int i=0;i<Integer.parseInt(args[1]);i++)
			System.out.println(message);
	}
}
