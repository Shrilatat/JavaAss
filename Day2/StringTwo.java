

public class StringTwo {
	public static void main(String[] args) {
		String[] var = {"www.abc.com","www.def.com","wwe.ghi.com"};
		int count=0;
		for(String v : var) {
			String a = v.substring(0, 3);
			if(a.equals("www")) {
				count+=1;
			}
		}
		System.out.println(count);
			
		
	}

}
