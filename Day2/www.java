
public class www {
	
	public static void main(String args[]) {
		
		String str[] = {"www.google.com","www.facebook.com","www.msn.com","www.amazon.in","in.answers.yahoo.com","en.m.wikipedia.com","codehs.gitbooks.io","www.coderanch.com"};
		
		int counter = 0;
		for(String s : str) {
			
			if (s.indexOf("www")==0) {
				counter++; 
			}
			
		}
		
		System.out.println("No of websites beginning with www: "+ counter);
		
		
	}

}
