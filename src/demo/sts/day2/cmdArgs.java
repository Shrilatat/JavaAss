package demo.sts.day2;

public class cmdArgs {
	public static void main(String[] args) {
		for (int i=0;i<Integer.parseInt(args[1]);i++)
			System.out.println(args[0]);
	}
}
