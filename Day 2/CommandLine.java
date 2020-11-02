
public class CommandLine {
	public static void main(String[] args) {
		
		int x= Integer.parseInt(args[0]);
		
		for(int i=0;i<x;i++)
			System.out.println(args[1]);
	}
}
