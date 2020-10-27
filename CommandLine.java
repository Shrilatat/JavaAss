
public class CommandLine {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		
		System.out.println("String: " + args[1]);
		System.out.println("Number of times:" + n);

		for (int i = 0; i < n; i++) {
			System.out.println(args[1]);
		}
	}
}
