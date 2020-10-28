
public class Website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"www.google.com", "www.msn.com", "www.amazon.com", "in.answers.yahoo.com", "en.m.wikipedia.com", "codehs.gitbooks.io", "www.coderanch.com"};
		int cnt = 0;
		
		for(int i=0;i<str.length;i++) {
			if(str[i].startsWith("www")) {
				cnt++;
			}
		}
		
		System.out.println("Number of Strings starting with www are : " + cnt);

	}

}
