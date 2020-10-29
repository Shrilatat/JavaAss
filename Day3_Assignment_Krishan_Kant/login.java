package demo;

import java.util.*;


public class login {

	public static void main(String[] args)
	{
		Map<Integer, String> map=new HashMap<>();
		
	
		map.put(1,"Krishan");
		map.put(2, "Shrilata");
		Scanner sc=new Scanner(System.in);
//		int id=sc.nextInt();
//		String pwd=sc.nextLine();
		int id;
		String pwd;
		try
		{
			System.out.println("Please enter login id : ");
			id = sc.nextInt();
			System.out.println("Please enter password");
			pwd = sc.next();
		}
		finally
		{
			sc.close();
		}
		
		Set<Integer> keys=map.keySet();
		int ans=0;
		for(Integer key:keys)
		{
			if(key==id && map.get(key).equals(pwd)
					)
			{
				ans=1;
				System.out.println("True Credentials");
			}
			
		}
		if(ans==0)
			System.out.println("ID Password don't match");
		
//		System.out.println(id +" "+ pwd);
	}
	
}
