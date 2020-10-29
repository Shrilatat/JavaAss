import java.util.Scanner;

public class string1 {	
	static String isPalindrome(String name) { 
        int a = 0, b = name.length() - 1; 
        while (a < b) { 
            if (name.charAt(a) != name.charAt(b)) 
                return "Not a Palindrome "; 
            a++; 
            b--; 
        } 
        return "A Palindrome"; 
    } 
	
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter String");
       String name=sc.next();
       System.out.println("String Length : "+name.length());
       System.out.println("String in Uppercase : " + name.toUpperCase());
       System.out.println(isPalindrome(name));
       sc.close();
    }
}
