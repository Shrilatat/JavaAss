
public class five_dig {

	public static void main(String[] args)
	{
		int a=19876;
		int sum=0;
		String s="\0";
		
		while(a%10!=0)
		{
			String b;
			sum=sum+a%10;
			
			b=Integer.toString(a%10);
			a=a/10;
			s=s+" "+b;
//			System.out.print(b+" ");
			
		}
		System.out.println(sum);
		System.out.println("String is"+ s);
	}
	
}
