
public class CommandLine {
	
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		System.out.println("String is : " + args[1]);
		
		System.out.print("\nPrint " + args[1] + " " + num + " number of times : ");
		
		for(int i = 0; i < num; i++) {
			System.out.print(args[1] + "  ");
		}
	}

}
