import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle[] rt=new Rectangle[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<rt.length;i++) 
		{
			System.out.println("Enter the length:");
			double length=sc.nextDouble();
			System.out.println("Enter the width:");
			double width=sc.nextDouble();
			rt[i]=new Rectangle(length,width);
		}
		for(int i=0;i<rt.length;i++)
		{
			rt[i].calpt();
			rt[i].calar();
		}
		for(int i=0;i<rt.length;i++)
		{
			System.out.println("Length:"+rt[i].getl()+"\nWidth:"+rt[i].getw()+"\nPerimeter:"+rt[i].getpt()+"\nArea:"+rt[i].getar());
		}

	}

}
