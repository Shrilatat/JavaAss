import java.util.Scanner ;

public class stringPalind {
      
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String str = sc.nextLine();
		
		int Len = str.length();
		
		System.out.println("Length of string :" + Len);
		
		System.out.println(str.toUpperCase());
		
		int i=0 , j=Len-1 ;
		boolean b = false ;
		
		while(i<j)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				System.out.println("string is not palindrome");
				b=true;
				break;
			}
			i++;
			j--;
		}
		
		if(b==false)
		System.out.println("string is palindrome");
		
	}
}
