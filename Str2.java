
public class Str2 {
	
	
		public static void main(String[] args) {
			String[] str = {"www.amazon.com","www.flipkar.com","wsz.abcc.com"};
			int num=0;
			for(String i : str) {
				String temp = i.substring(0, 3);
				if(temp.equals("www")) {
					num+=1;
				}
			}
			System.out.println(num);
				
			
		}

	}


