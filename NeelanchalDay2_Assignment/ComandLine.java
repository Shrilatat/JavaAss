
public class ComandLine {
	
	
	public static void main(String[] args) {
		
		int a1 = Integer.parseInt(args[0]);
		
		while(a1>0)
		{
			System.out.println(" " + args[1]);
			a1--;
		}
	}
}
