
public class Sites {
	public static int Find(String[] str){
		int number=0;
		for(String s: str) {
			if(s.charAt(0)=='w' && s.charAt(1)=='w' && s.charAt(2)=='w')
				number++;
		}
		return number;
	}
	public static void main(String[] args) {
		String[] s= {"ww.ha", "www.google", "haadd","www.kill"};
		System.out.println(Find(s));
		
	}
}
