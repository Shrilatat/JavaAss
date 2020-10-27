
public class Website {
	
	public static void main(String[] args) {
		
		String[] sites = {"www.google.com", "www.msn.com", "www.amazon.co.in", "in.answers.yahoo.com", "en.m.wikipedia.com", "codehs.gitbooks.io", "www.coderanch.com"};
		
		int count = 0;
		for(String s: sites) {
			if(s.startsWith("www")) {
				count++;
			}else {
				continue;
			}
		}
		System.out.println("Total number of sites starting with \"www\": " + count);
	}
}
