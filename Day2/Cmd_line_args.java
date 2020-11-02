
public class Cmd_line_args {
	
	public static void main(String args[]) {
		if(args.length>1) {
			
			int n = Integer.parseInt(args[0]); //integer
			String s = args[1]; //message
			
			for (int i =1 ; i<=n; i++) {
				System.out.println(s);
			}
		}
	}
}
