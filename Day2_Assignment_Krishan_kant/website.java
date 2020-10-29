import java.util.Scanner;

public class website {

	
	public static void main(String[] args)
	{
		String s[]=new String[5];
		Scanner sc = new Scanner(System. in );
		for(int i=0;i<5;i++)
		{
			s[i]=sc.nextLine();

		}
		

		int ans=0;
//		String test="w"
		for(int i=0;i<5;i++)
		{
			if(s[i].indexOf("www")!=-1)
			{
				ans++;
			}

		}
		System.out.println(ans);
	}
}
