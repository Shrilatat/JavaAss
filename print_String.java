
public class print_String {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[args.length - 1]);
		
		for(int i =0; i<n; i++) {
			for(int j=0; j<args.length-1; j++) {
				System.out.println(args[j]);
			}
		}
	}
	

}
