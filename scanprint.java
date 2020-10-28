import java.util.Scanner;
public class scanprint {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number");
        int no=sc.nextInt();
        System.out.println("enter String");
        String name=sc.next();
        for(int a=0; a < no; a++) {
        	System.out.println(name);
		}
        sc.close();
     }
}