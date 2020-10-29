import java.util.Scanner;

public class commandline {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in );
		int a=Integer.valueOf(args[1]);
		
		for(int i=0;i<a;i++)
		{
			System.out.println(args[0]);
		}
//		System.out.println(a);
		
	}
	
}
