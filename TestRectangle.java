import java.util.Scanner;
public class TestRectangle {
	
	
	public static void main(String args[]) {
		
		rectangle[] Rarr = new rectangle[3];
				
		for (int i=0; i< Rarr.length; i++ ) {
			Rarr[i] = new rectangle();
		}
	
		Scanner sc = new Scanner(System.in);
		
		for (rectangle r : Rarr ) {
			int len, br;
			len = sc.nextInt();
			br = sc.nextInt();
			
			
			
			r.setLength(len);
			r.setBreadth(br);
			
			System.out.println(r);
		}
	}
	

}
